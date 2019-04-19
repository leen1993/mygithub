package com.rekj.core.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONObject;

public class HttpUtil {
	
	private static final CloseableHttpClient httpclient = HttpClients.createDefault();
	
	public static String getContentByUrl(String url, String charset)
			throws ParseException, IOException {
		//HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(url);
		HttpResponse response = httpclient.execute(httpget);

		if (StringUtil.isEmpty(charset)) {
			String defaultCharset = "iso-8859-1";
			Header contentTypeHeader = response.getFirstHeader("Content-Type");
			String contentType = contentTypeHeader.getValue().toLowerCase();
			if ((contentType.indexOf("gbk") > -1)
					|| (contentType.indexOf("gb2312") > -1)
					|| (contentType.indexOf("gb18030") > -1)) {
				defaultCharset = "gb18030";
			} else if (contentType.indexOf("utf-8") > -1) {
				defaultCharset = "utf-8";
			} else if (contentType.indexOf("big5") > -1) {
				defaultCharset = "big5";
			}
			charset = defaultCharset;
		}
		Header contentEncoding = response.getFirstHeader("Content-Encoding");
		StatusLine line = response.getStatusLine();
		if (line.getStatusCode() == 200) {
			HttpEntity entity = response.getEntity();
			InputStream is;
			if ((contentEncoding != null)
					&& (contentEncoding.getValue().toLowerCase().equals("gzip"))) {
				is = new GZIPInputStream(entity.getContent());
			} else {
				is = entity.getContent();
			}
			String str = FileUtil.inputStream2String(is, charset);
			is.close();
			return str;
		}

		return "";
	}

	public static String getContentByUrl(String url) throws ParseException,
			IOException {
		return getContentByUrl(url, "");
	}

	public static void saveRemoteFile(String remoteFile, String localFile)
			throws ParseException, IOException {
		//HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(remoteFile);
		HttpResponse response = httpclient.execute(httpget);
		Header contentEncoding = response.getFirstHeader("Content-Encoding");
		StatusLine line = response.getStatusLine();
		if (line.getStatusCode() == 200) {
			HttpEntity entity = response.getEntity();
			InputStream is;
			if ((contentEncoding != null)
					&& (contentEncoding.getValue().toLowerCase().equals("gzip"))) {
				is = new GZIPInputStream(entity.getContent());
			} else {
				is = entity.getContent();
			}
			FileUtil.createFolder(localFile, true);
			FileOutputStream fs = new FileOutputStream(localFile);

			int byteread = 0;
			byte[] buffer = new byte[30000];
			while ((byteread = is.read(buffer)) != -1) {
				fs.write(buffer, 0, byteread);
			}
			is.close();
			fs.close();
		}
	}
	
	public static String sendGet(String url) {
		
        HttpGet httpget = new HttpGet(url);
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httpget);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        String result = null;
        try {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                result = EntityUtils.toString(entity);
            }
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
	
	 public static String sendPost(String url, Map<String, Object> map) {
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            formparams.add(new BasicNameValuePair(entry.getKey(), JSONObject.toJSONString(entry.getValue())));
        }
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, Consts.UTF_8);
        HttpPost httppost = new HttpPost(url);
        httppost.setEntity(entity);
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httppost);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HttpEntity entity1 = response.getEntity();
        String result = null;
        try {
            result = EntityUtils.toString(entity1);
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        return result;
    }
	 
	 public static String sendPost(String url) {
        HttpPost httppost = new HttpPost(url);
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httppost);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HttpEntity entity = response.getEntity();
        String result = null;
        try {
            result = EntityUtils.toString(entity);
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
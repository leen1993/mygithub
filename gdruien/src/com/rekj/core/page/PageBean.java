package com.rekj.core.page;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.rekj.core.util.StringUtil;

@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class PageBean implements Serializable {
	public static Integer SHOW_PAGES = 6;

	public static final Integer DEFAULT_PAGE_SIZE = 20;

	private int pageSize = DEFAULT_PAGE_SIZE;

	private int currentPage = 1;

	private int totalCount = 0;

	private String pageName = "pageIndex";
	private String pageSizeName = "pageSize";

	private boolean showTotal = true;

	public PageBean() {
	}

	public PageBean(int currentPage, int pageSize) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public void setPagesize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageName() {
		if (StringUtil.isEmpty(this.pageName))
			return "page";
		return this.pageName;
	}

	public String getPageSizeName() {
		if (StringUtil.isEmpty(this.pageSizeName))
			return "pageSize";
		return this.pageSizeName;
	}

	public boolean isFirstPage() {
		return getCurrentPage() == 1;
	}

	public boolean isLastPage() {
		return getCurrentPage() >= getLastPage();
	}

	public boolean isHasNextPage() {
		return getLastPage() > getCurrentPage();
	}

	public boolean isHasPreviousPage() {
		return getCurrentPage() > 1;
	}

	public int getLastPage() {
		return PageUtils.getTotalPage(this.totalCount, this.pageSize);
	}

	public int getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(int count) {
		this.totalCount = count;
	}

	public int getTotalPage() {
		int page = this.totalCount / this.pageSize;
		int tmp = this.totalCount % this.pageSize;
		return page + (tmp == 0 ? 0 : 1);
	}

	public int getThisPageFirstElementNumber() {
		return (getCurrentPage() - 1) * getPageSize() + 1;
	}

	public int getThisPageLastElementNumber() {
		int fullPage = getThisPageFirstElementNumber() + getPageSize() - 1;
		return getTotalCount() < fullPage ? getTotalCount() : fullPage;
	}

	public int getNextPage() {
		return getCurrentPage() + 1;
	}

	public int getPreviousPage() {
		return getCurrentPage() - 1;
	}

	public int getPageSize() {
		return this.pageSize;
	}

	public boolean isShowTotal() {
		return this.showTotal;
	}

	public void setShowTotal(boolean showTotal) {
		this.showTotal = showTotal;
	}

	public int getCurrentPage() {
		return this.currentPage;
	}

	public List<Integer> getLinkPageNumbers() {
		return PageUtils.getPageNumbers(getCurrentPage(), getLastPage(), 10);
	}

	public int getFirst() {
		return PageUtils.getFirstNumber(this.currentPage, this.pageSize);
	}

	public int getLast() {
		return PageUtils.getLastNumber(this.currentPage, this.pageSize, this.totalCount);
	}

	public Integer[] getPageArr() {
		int totalPages = getTotalPage();
		int minPage = 1;
		int maxPage = totalPages;
		if (this.currentPage == 1) {
			maxPage = SHOW_PAGES;
		} else {
			minPage = this.currentPage - (SHOW_PAGES / 2 + SHOW_PAGES % 2);
			if (minPage <= 0) {
				minPage = 1;
			}
			maxPage = minPage + SHOW_PAGES - 1;
		}
		if (maxPage > totalPages) {
			maxPage = totalPages;
		}
		Integer[] arrs = new Integer[maxPage - minPage + 1];
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = minPage + i;
		}
		return arrs;
	}
}

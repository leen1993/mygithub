
mini.ux.form = function() {
};

mini.extend(mini.ux.form, {
	getResultStatus: function (data) {
		try {
			var d = eval("(" + data + ")");
			return {
				success: d["result"] == 1,
				message: d["message"]
			};	
		} catch(e){
			return {
				success: false,
				message: "未知的返回值错误"
			};
		}
	}
});


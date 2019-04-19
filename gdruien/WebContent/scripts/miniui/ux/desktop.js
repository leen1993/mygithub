PortalMgr = function () {
    this.columns = [];
    this.datas = [];
    this.widthMap = null;
    this.layoutId = 0;
    this.portal = new mini.ux.Portal();
    PortalMgr.superclass.constructor.call(this);
};

mini.extend(PortalMgr, function(){}, {
	init: function() {
		var that = this;
		var layoutId=$("#layoutId").val();
		var url=__ctx+'/platform/system/desktop/getMyDesktop.do';
		if(layoutId){
			url=__ctx+"/platform/system/desktop/getLayoutData.do?layoutId="+layoutId;
		}
		$.post(url,function(data){
			that.handler(data);
		});
	},
	
	handler: function(cfg) {
		this.reset();
		var colNum = cfg.columns.length;
		if (colNum == 1) {
			this.portal.set({
	 	        style: "width: 100%;height:100%;",
	 	        columns: ["100%"]
	 	    });
		} else if (colNum == 2) {
			this.portal.set({
	 	        style: "width: 100%;height:100%;",
	 	        columns: ["50%", "50%"]
	 	    });
		} else if (colNum == 3) {
			this.portal.set({
	 	        style: "width: 100%;height:100%;",
	 	        columns: ["33.3333%", "33.3333%", "33.333%"]
	 	    });
		} else {
			top.mini.alert("portal布局最多支持3列");
			return;
		}
		
		this.portal.render(window.portalDiv ? "#portalDiv" : document.body);
 	    var portlets = [];
		for(var i=0; i<cfg.columns.length; i++) {
			for(var j=0; cfg.datas[i+1] && j<cfg.datas[i+1].length;j++) {
				var data = cfg.datas[i+1][j];
				var columnId = data.columnId;
				if(!columnId) {
					columnId = data.id;
				}
				
				var url=__ctx+'/platform/system/desktopColumn/getColumnData.do?id='+columnId;
				var portlet = {};
				portlet.column = i;
				portlet.id = columnId;
				portlet.title = data.columnName;
				portlet.showCloseButton = true;
				portlet.height = 228;
				// portlet.body = url;
				// portlet.body = '<iframe frameborder="0" frameborder="0" style="width:100%;height:100%;" border="0" margin="0" src="{0}"/></iframe>';
				// portlet.body = String.format(portlet.body, url);
				portlets.push(portlet);
				// var moreUrl;
				// if(data.columnUrl!=null){
				//	moreUrl = __ctx + data.columnUrl;
				// }
			}
		}
		
		function renderContent(panel) {
			var url=__ctx+'/platform/system/desktopColumn/getColumnData.do';
			$.post(url, {id : panel.id}, function(r) {
				if (r.html) {
					var pBody = panel.getBodyEl();
					$(r.html).appendTo(pBody); //$(pBody)
					// pBody.appendChild($(r.html));
				}
			});
		}
		
		this.portal.setPanels(portlets);
		var panels = this.portal.getPanels();
		for (var i=0; i<panels.length; i++) {
			// this.portal.getPanelBodyEl(p.id);
			var panel = panels[i];
			renderContent(panel);
		}
	},
	
	addColumn : function() {
		var index = $("#colsSelectC").val();
		index = parseInt(index)-1;
		var panels = this.portal.getPanels();
		if (index >= this.portal.columns.length) {
			return;
		}
		// panels[index].addPanel();
		
		var columnId = $("#columnName").val();
		var columnName = $('select option:selected').attr('name');
		var moreUrl = $('select option:selected').attr('moreUrl');
		var url = __ctx + "/platform/system/desktopColumn/getColumnData.do?id="+ columnId;
		
		var portlet = {};
		portlet.column = index;
		portlet.id = columnId;
		portlet.title = columnName;
		portlet.showCloseButton = true;
		portlet.height = 230;
		//portlet.body = '<iframe frameborder="0" frameborder="0" style="width:100%;height:100%;" border="0" margin="0" src="{0}"/></iframe>';
		//portlet.body = String.format(portlet.body, url);
		this.portal.addPanel(portlet);
	},
	
	reset : function () {
		this.portal.removeAll();
	},

	changLayout : function() {
		var that = this;
		var layoutId = $("#colsSelect").val();
		var url = __ctx + "/platform/system/desktop/getLayoutData.do?layoutId=" + layoutId;
		$.post(url, function(data) {
			that.handler(data);
		});
	},
	
	saveLayout : function() {
		var panels = this.portal.getPanels();
		var layoutId = $("#colsSelect").val();
		var url = __ctx+"/platform/system/desktopMycolumn/saveCol.do";
		if(!layoutId){
			layoutId=$("#layoutId").val();
			url = __ctx+"/platform/system/desktopLayoutcol/saveCol.do";
		}
		// var cols = self.columns.length;
		
		var data = [];
		for (var i=0,l=panels.length; i<l; i++) {
			var d = {};
			d.col = panels[i].column+1;
			d.sn = "1",
			d.columnId = panels[i].id;
			data.push(d);
		}
		$.post(url,{"layoutId":layoutId,"data": mini.encode(data)}, function(r) {				
			var s=$.parseJSON(r);				
			if(s.result==1)
				location.reload();
			else {
				top.mini.error(s.message);
			}
		});
	}
	
});


<%@page pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>练习zTree</title>
	<meta charset="utf-8">
	<link type="text/css" href="../css/zTreeStyle/zTreeStyle.css" rel="stylesheet"/>
	<script type="text/javascript" src="../scpript/ztree/jquery-1.4.4.min.js"></script>
	<script type="text/javascript" src="../scpript/ztree/jquery.ztree.all.min.js"></script>
	<script type="text/javascript">
		var zTreeObj;
	   	// zTree 的参数配置，深入使用请参考 API 文档（setting 配置详解）
	   	var setting = {
	   			callback:{
	   				onClick:f1,
	   				onRightClick:f2
	   			},
	   			view:{
	   				
	   			}
	   			
	   	};
	   	function f1(event, treeId, treeNode){
	   		$.fn.zTree.getZTreeObj(treeId).expandNode(treeNode);
	   	}
	   	function f2(event, treeId, treeNode){
	   		$.fn.zTree.getZTreeObj(treeId);
	   	}
	   	// zTree 的数据属性，深入使用请参考 API 文档（zTreeNode 节点数据详解）
	   	var zNodes = [
	   	{name:"test1", open:false, children:[
	      {name:"test1_1"}, {name:"test1_2",children:[{name:"test1_2_1"},{name:"test1_2_2"}]}]},
	   	{name:"test2", open:false, children:[
	      {name:"test2_1"}, {name:"test2_2"}]}
	   	];
	   	var schemaUrl = "http://localhost:7001/PSMVC";
		function f0(){
		   alert("${pageContext.request.contextPath}");
	   		$.ajax({
	   			url:schemaUrl+"/zTree/load.do",
	   			type:"post",
	   			dataType:"text",
	   			success:function(data){
	   				alert(data);
	   				$.fn.zTree.init($("#treeDemo"), setting, zNodes);
	   			},
	   			error:function(){
	   				alert("载入节点失败！");
	   			}
	   		});
	   	}
	</script>
</head>
<body>
	<div><input type="button" value="点击加载" onclick="f0()"/></div>
	<div>
		 <ul id="treeDemo" class="ztree"></ul>
	</div>
</body>
</html>
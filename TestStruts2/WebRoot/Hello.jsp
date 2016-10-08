<%@page pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html>
<head>
	<meta content="text/html;charset=utf-8">
	<title>测试strts2</title>
	<script type="text/javascript" src="script/jquery-1.11.1.js"></script>
	<script type="text/javascript">
		function testA(){
			$("#form1").submit();
		}
	</script>
</head>
<body>
	<div id="d1">Hello,Struts2!</div>
	<div>${message }</div>
	<div>
		<s:property value="message"/>
	</div>
	<div>
		<form id="form1" name="form1" action="testA.action" method="post">
			<input type="text" name="i1" value="${i44 }">
			<input type="text" name="i2" value="${i33 }">
			<input type="text" name="i3" value="${i22 }">
			<input type="text" name="i4" value="${i11 }">
			<input type="button" value="提交" onclick="testA()">
		</form>
	</div>
</body>
</html>
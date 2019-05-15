<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	<h4>${username},helloworld!</h4>
	<br />
	<div>
		<a href="${pageContext.request.contextPath}/user/add">用户添加</a>
	</div>
	<div>
		<a href="${pageContext.request.contextPath}/user/delete">用户删除</a>
	</div>
	<div>
		<a href="${pageContext.request.contextPath}/user/list">用户查询</a>
	</div>
	<div>
		<a href="${pageContext.request.contextPath}/user/update">用户修改</a>
	</div>




</body>
</html>
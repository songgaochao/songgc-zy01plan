<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}css/bootstrap.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	
			<h3>投资项目详情</h3>
<form:form action="${pageContext.request.contextPath}/toadd" method="post" modelAttribute="plan">
项目名称：${inf.pname }<br>
投资金额：${inf.amount }<br>
分管领导：${inf.manager }<br>
所属部门：${inf.names}<br>
项目介绍：${inf.content}
 </form:form>	
<a href="${pageContext.request.contextPath}/list">返回</a>
</body>
</html>
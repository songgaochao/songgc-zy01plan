<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
<script type="text/javascript">


</script>
</head>
<body>
<h3>项目发布</h3>
<form:form action="${pageContext.request.contextPath}/toadd" method="post" modelAttribute="plan">
项目名称：<form:input path="pname"/><br>
所属部门：<form:select items="${depar}" path="did" itemLabel="names" itemValue="id"></form:select>

<br>
投资金额：<form:input path="amount"/><br>
分管领导：<form:input path="manager"/><br>
项目介绍：<form:textarea placeholder="请介绍项目..." path="content"  cols="35" rows="5"/><br>
<input type="submit" value="发布">
</form:form>
</body>
</html>
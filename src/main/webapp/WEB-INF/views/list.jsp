<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}css/bootstrap.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
<script type="text/javascript">
function goPage(page) {
	location="${pageContext.request.contextPath}/list?page="+page;
}

function del(th) {
	$("[name='ck']").attr("checked",th.checked);
}
function todel() {
	var id =$("[name='ck']:checked").map(function () {
		return this.value;
	}).get().join();
	$.ajax({
		url:"${pageContext.request.contextPath}/todel",
		data:{id:id},
		type:"post",
		success:function(tu){
			if(tu>0){
				location="${pageContext.request.contextPath}/list";
			}else{
				alert="删除失败！";
			}
		}
	})
}
</script>
</head>
<body>
<form action="${pageContext.request.contextPath}/list?plan" method="post">

<input type="text" name="pname"  placeholder="按项目名称查询">
<input type="submit" value="查询">
</form>
	<table class="table table-hover">
		<tr>
		<td>
		<input type="checkbox" onclick="del(this)">
		<input type="button" value="删除" onclick="todel()">
		</td>
			<td>主键</td>
			<td>项目名称</td>
			<td>投资金额</td>
			<td>分管领导</td>
			<td>部门</td>
			<td>操作
			<a href="${pageContext.request.contextPath}/add">更新</a>
			</td>
		</tr>
		<c:forEach items="${info.list }" var="stu">
			<tr>
			<td>
			<input type="checkbox" name="ck" value="${stu.pid}">
			</td>
				<td>${stu.pid }</td>
				<td>${stu.pname }</td>
				<td>${stu.amount }</td>
				<td>${stu.manager }</td>
				
				<td>${stu.names }</td>
				<td>
				<a href="${pageContext.request.contextPath}/xiangq?pid=${stu.pid}">查看详情</a>
				</td>
			</tr>

		</c:forEach>
		<tr>
		<td colspan="100" align="center">
		<jsp:include page="/resource/pages02.jsp"></jsp:include>
		</td>
		</tr>
	</table>
</body>
</html>
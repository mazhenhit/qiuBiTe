<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html;charset=utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>匹配信息</title>
</head>
<body>
	<table>
		<tr>
			<td>匹配编号</td>
			<td>手机尾号</td>
			<td>我的昵称</td>
			<td>你的昵称</td>
		</tr>
		<c:forEach items="${matchInfos}" var="item">
			<tr>
				<td>${item.id }</td>
				<td>${item.phoneNum1 }</td>
				<td>${item.name1 }</td>
				<td>${item.name2 }</td>
				<td>${item.updateTime }</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>
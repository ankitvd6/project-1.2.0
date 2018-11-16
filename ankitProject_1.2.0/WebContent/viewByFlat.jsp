<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@page import="dBUtility.Dao,dBUtility.InventoryBean" %>
<%@page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/pphHeader.css">
<title>Available Inventories</title>
</head>
<body>
<div class="header">
<h1>Inventory Result</h1>  
</div>

<%
String flat=request.getParameter("flat");
List<InventoryBean> list=Dao.viewByFlat(flat);
request.setAttribute("list", list);
%>

<h1>Inventory</h1>
<table border="2" width="90%" cellpadding="10">  
<tr><th>Flat</th><th>Wing</th><th>Society</th></tr>

<c:forEach items="${list}" var="b">
<tr>
	<td>${b.getFlat()}</td>
	<td>${b.getWing()}</td>
	<td>${b.getSociety()}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
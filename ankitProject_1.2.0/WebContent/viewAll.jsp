<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@page import="dBUtility.Dao,dBUtility.InventoryBean" %>
<%@page import="java.util.*" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/button.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/pphHeader.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/topNav.css">
</head>

<style>

body{
background: url(' https://imperialprogram.asia/wp-content/uploads/2017/03/3-Real-Estate.jpg') no-repeat;
background-size:cover;
font-family:Aria;
}

.form form,
.form form div{
display:inline;
}
.margin{
margin:10px 250px;
}
</style>




<body>
<div class="header">
<h1>PPH Realty and Developers</h1>
</div><br><br>

<% List<InventoryBean> list=Dao.viewAllInventory();
request.setAttribute("list", list);
 %>

<h1>Inventory List</h1>  
<table style="background-color:lightgrey;" border="2" width="90%" cellpadding="10">  
<tr><th>Id</th><th>Flat</th><th>Wing</th><th>Society</th></tr>
  
   <c:forEach items="${list}" var="b">   
   <tr>
   <td>${b.getId()}</td>  
   <td>${b.getFlat()}</td>  
   <td>${b.getWing()}</td>  
   <td>${b.getSociety()}</td>
   <td>
   		<a href="editView.jsp">Edit</a>
   </td>
   <td>
   		<a href="DeleteServlet?">Delete</a>
   </td>
     
   </tr>  
   </c:forEach>  
   
   </table>  
   <br/>  
   <div class="form margin">
   	<form action="addForm.html">
   		<button type="submit" class="button">Add Inventory</button>
   	</form>
   	<form action="index2.jsp">
   		<button type="submit" class="button">Go Back</button>
   	</form>
   	<form action="login.html">
   		<button type="submit" class="button">Logout</button>   	
   	</form>
   
   </div>
</body>
</html>
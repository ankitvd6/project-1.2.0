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
<style>
.form{
width:300px;
margin:0 auto;
}
.c{
font-size:20px;
font-family:vardana;
}
</style>
</head>


<body>



<fieldset><legend style="font-size:30px;">Edit Inventory</legend><br><br>
<form class="form" action="EditServlet" method="post">
<div class="c">
Id &emsp;&emsp;&emsp;&emsp;<input type="text" name="id"><br><br>
Flat Number&nbsp;<input type="text" name="flat"><br><br>
Wing&emsp;&emsp;&emsp;<input type="text" name="wing"><br><br>
Society&emsp;&emsp; <input type="text" name="society"><br><br>
	<button type="submit" class="button" value="Submit">Update</button>
</div>
</form>
<br><br><br><br>
</fieldset>
</body>
</html>
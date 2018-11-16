<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/button.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/pphHeader.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/topNav.css">
</head>
<style>
.bcenter{
height:50px;
width:250px;
}
.form form,
.form form div{
display:inline;
}
.button:last-child{
margin-right:0;
}

.footer{
	position: fixed;
	left: 0;
	bottom: 0;
	with:100%;
}

.center{
margin:30px 200px;

}

body{
background: url(' https://imperialprogram.asia/wp-content/uploads/2017/03/3-Real-Estate.jpg') no-repeat;
background-size:cover;
font-family:Aria;


}
</style>




<body>

<ul>
	<li><a href='#'>Home</a></li>
	<li><a href='#'>About</a>
		<ul>
			<li><a href='#'>About Us</a></li>
			<li><a href='#'>Our Clients</a></li>
		</ul>
	</li>
	
	<li><a href='#'>Career</a> 
		<ul>
			<li><a href='#'>See Openings</a></li>
			<li><a href='#'>NewsLetter</a></li>
		</ul>
	</li>
	
	<li><a href="login.html">Logout</a></li>
</ul>

<br><br><br>

<div class="form center footer">
	<form  action="addForm.html" >
		<button type="submit" class="button bcenter">Add Inventory</button>
	</form>
	
	<form action="viewPage.jsp">
		<button type="submit" class="button bcenter">View Inventory</button>
	</form>
	
	<form action="login.html">
		<button type="submit" class="button bcenter">Logout</button>
	</form>
</div>

</body>


</html>
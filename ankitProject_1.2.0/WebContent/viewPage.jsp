<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/button.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/topNav.css">
<style>

body{
background: url('https://res.cloudinary.com/domain/image/fetch/c_fill,w_600/https://static.domain.com.au/domainblog/uploads/2018/03/27220034/1_h0xyn2.jpg') no-repeat;
background-size:cover;
font-family:Aria;
}


.form{
margin:10px 200px;
}
.form form,
.form form div{
display:inline;
}
</style>
<title>Insert title here</title>
</head>


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

<br><br><br><br><br>

<form action="viewAll.jsp">
<button type="submit" class="button">View All Inventory</button>
</form>

<fieldset style=" background-color: lightgrey;"><legend style="font-size:30px">Custom View</legend><br><br>
<div>
	<form action="viewByFlat.jsp" class="form">
		Flat &emsp;&emsp;&nbsp;<input type="text"  name="flat" >
		<button type="submit" class="button">Search</button>
	</form>
</div>	
<div>
	<form action="viewByWing.jsp" class="form">
		Wing &emsp;&nbsp;&nbsp;&nbsp;<input type="text" name="wing">
		<button type="submit" class="button">Search</button>
	</form>
</div>
<div>
	<form action="viewBySociety.jsp" class="form">
		Society &emsp;<input type="text" name="society" >
		<button type="submit" class="button">Search</button>
	</form>	
</div>


<br><br><br>
</form>
</fieldset>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin-Home</title>
<link rel="stylesheet" href="login.css">
</head>
<style>
body {background-image:url("https://images.unsplash.com/photo-1607619056574-7b8d3ee536b2?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1110&q=80" );
background-size:cover;
}
a:link
{
    color:black;
}
.loginbox form
{
	text-align:center;
	padding-top: 27px;
}
</style>
<body>
<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");	//http 1.1
	response.setHeader("pragma","no-cache");	//http 1.0
	response.setHeader("Expires","0");		//proxies

	if(session.getAttribute("uID")==null)
	{
		response.sendRedirect("login.html");
	}
%>

<div class="loginbox">
<h1>Hospital Management</h1>
<h1>Welcome Admin</h1>
        
<form action="AdminHospital"><button type="button" class="cancelbtn"><a href=ShowHospital>Hospital</a></button></form>
<form action="AdminUsers"><button type="button" class="cancelbtn"><a href=Users.html>Users</a></button></form>
<form action="AdminPatient"><button type="button" class="cancelbtn"><a href=Hospital.html>Patient</a></button></form>
<form action="AdminNurse"><button type="button" class="cancelbtn"><a href=Nurse.html>Nurse</a></button></form>
<form action="AdminDcotor"><button type="button" class="cancelbtn"><a href=Doctor.html>Doctor</a></button></form>       
<form action="logout"><button type="submit">Logout</button></form>      
     
</div> 
                
      


</body>
</html>
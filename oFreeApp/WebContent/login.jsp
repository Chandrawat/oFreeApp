<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>oFreeApp</title>
<link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<link href='style/style.css' rel='stylesheet' type='text/css'>
</head>
<body>
<div class="logo"><span style="font-size:33px;margin-left: 76px;">oFree</span></div>
<div class="login-block">
<form action="LoginServlet"> 
	 <br>
	<input class="inputClass" type="text"  name="un" placeholder="Username" id="username" />
 	
 	<input class="inputClass" placeholder="Password" type="password" name="pw" id="password" />
 <input class="button"  type="submit" value="Cancel">
 <input class="button" id="submitbutton" type="submit" value="submit"> 
 
 
 
 
 </form>
 
 </div>
</body>
</html>
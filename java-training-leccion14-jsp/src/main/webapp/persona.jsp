<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="training.javaee.jsp.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Importacion</title>
</head>
<body>

	<p>El nombre y apellido de esta persona es: <%=Persona.mostrarNombres("Alberto", "Gómez") %></p>

</body>
</html>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Empleado</title>
</head>
<body>
    <h1>Lista de empleados</h1>
	
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Edad</th>
				<th>Salario</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="em" items="${empleados}">
			    <tr>
					<td><c:out value="${em.id}"/></td>
					<td><c:out value="${em.nombre}"/></td>
					<td><c:out value="${em.apellido}"/></td>
					<td><c:out value="${em.edad}"/></td>
					<td><c:out value="${em.salario}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
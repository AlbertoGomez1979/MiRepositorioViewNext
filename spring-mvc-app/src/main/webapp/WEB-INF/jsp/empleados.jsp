<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP WEB APP</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">
</head>
<body>
	<nav class="navbar bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand">Navbar</a>
			<form class="d-flex" role="search">
				<input class="form-control me-2" type="search" placeholder="Search"
					aria-label="Search">
				<button class="btn btn-outline-success" type="submit">Search</button>
			</form>
		</div>
	</nav>
	<div class="container mt-5">
		<h1>Lista de Empleados</h1><a href="empform" class="me-2">Agregar Empleado</a>
		<table class="table table-bordered mt-5">
			<tr>
				<th>Id</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Salario</th>
				<th>Edad</th>
				<th>Editar</th>
				<th>Eliminar</th>
			</tr>
			<c:forEach var="emp" items="${list}">
				<tr>
					<td>${emp.empleado_id}</td>
					<td>${emp.nombre}</td>
					<td>${emp.apellido}</td>
					<td>${emp.salario}</td>
					<td>${emp.edad}</td>
					<td><a href="editaremp/${emp.empleado_id}">Editar</a></td>
					<td><a href="eliminaremp/${emp.empleado_id}">Eliminar</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js"></script>
</body>
</html>
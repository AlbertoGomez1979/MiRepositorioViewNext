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
	<br>
	<div class="container">
		<h1>Agregar Empleado</h1><br>
		<form:form class="row g-3" method="post" action="agregar">
		    <p>${empleado_id}</p>
		    <form:hidden  path="empleado_id" />
		    <div class="mb-3 row">
				<label for="nombre" class="col-sm-2 col-form-label">Nombre</label>
				<div class="col-sm-6">
					<form:input path="nombre" type="text" class="form-control" />
				</div>
			</div>
			<div class="mb-3 row">
				<label for="apellido" class="col-sm-2 col-form-label">Apellido</label>
				<div class="col-sm-6">
					<form:input path="apellido" type="text" class="form-control" />
				</div>
			</div>
			<div class="mb-3 row">
				<label for="apellido" class="col-sm-2 col-form-label">Salario</label>
				<div class="col-sm-6">
					<form:input path="salario" type="text" class="form-control" />
				</div>
			</div>
			<div class="mb-3 row">
				<label for="edad" class="col-sm-2 col-form-label">Edad</label>
				<div class="col-sm-6">
					<form:input path="edad" type="text" class="form-control" />
				</div>
			</div>
			<div class="col-12">
			    <input type="submit" class="btn btn-primary" value="Guardar" />
			</div>
		</form:form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js"></script>
</body>
</html>
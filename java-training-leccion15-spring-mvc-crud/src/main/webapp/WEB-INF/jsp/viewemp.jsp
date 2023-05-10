<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Lista de Empleados</h1>
<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Id</th>
		<th>Nombre</th>
		<th>Apellido</th>
		<th>Departamento</th>
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
			<td>${emp.departamento}</td>
			<td>${emp.salario}</td>
			<td>${emp.edad}</td>
			<td><a href="editemp/${emp.empleado_id}">Editar</a></td>
			<td><a href="deleteemp/${emp.empleado_id}">Eliminar</a></td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="empform">Agregar Empleado</a>
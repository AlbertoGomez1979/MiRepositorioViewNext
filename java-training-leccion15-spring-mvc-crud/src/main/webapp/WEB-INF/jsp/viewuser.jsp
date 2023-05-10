<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Lista de Usuarios</h1>
<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Id de usuario</th>
		<th>Nombre</th>
		<th>Nombre de usuario</th>
		<th>Dni</th>
		<th>Email</th>		
		<th>Contraseña</th>
		<th>Editar</th>
		<th>Eliminar</th>
	</tr>
	<c:forEach var="user" items="${list}">
		<tr>
			<td>${user.idusuario}</td>
			<td>${user.nombre}</td>
			<td>${user.nombreusuario}</td>
			<td>${user.dni}</td>
			<td>${user.email}</td>
			<td>${user.password_2}</td>
			<td><a href="edituser/${user.idusuario}">Editar</a></td>
			<td><a href="deleteuser/${user.idusuario}">Eliminar</a></td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="userform">Agregar Usuario</a>
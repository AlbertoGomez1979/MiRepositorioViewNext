<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Editar Usuario</h1>
       <form:form method="POST" action="/java-spring-mvc/editsaveuser">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="idusuario" /></td>
         </tr> 
        <tr>  
          <td>Nombre : </td> 
          <td><form:input path="nombre"  /></td>
         </tr>  
         <tr>  
          <td>Nombre de usuario :</td>  
          <td><form:input path="nombreusuario" /></td>
         </tr> 
         <tr>  
          <td>Dni :</td>  
          <td><form:input path="dni" /></td>
         </tr> 
         <tr>  
          <td>Email :</td>  
          <td><form:input path="email" /></td>
         </tr> 
         <tr>  
          <td>Contraseña :</td>  
          <td><form:input path="password_2" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Editar y Guardar" /></td>  
         </tr>  
        </table>  
       </form:form>  
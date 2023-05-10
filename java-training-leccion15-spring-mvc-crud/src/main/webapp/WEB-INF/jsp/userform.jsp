<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Agregar Usuario</h1>
       <form:form method="post" action="saveuser">  
      	<table >  
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
          <td><input type="submit" value="Guardar" /></td>  
         </tr>  
        </table>  
       </form:form>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Editar Empleado</h1>
       <form:form method="POST" action="/java-spring-mvc/editsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="empleado_id" /></td>
         </tr> 
        <tr>  
          <td>Nombre : </td> 
          <td><form:input path="nombre"  /></td>
         </tr>  
         <tr>  
          <td>Apellido :</td>  
          <td><form:input path="apellido" /></td>
         </tr> 
         <tr>  
          <td>Departamento :</td>  
          <td><form:input path="departamento" /></td>
         </tr> 
         <tr>  
          <td>Salario :</td>  
          <td><form:input path="salario" /></td>
         </tr> 
         <tr>  
          <td>Edad :</td>  
          <td><form:input path="edad" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Editar y Guardar" /></td>  
         </tr>  
        </table>  
       </form:form>  
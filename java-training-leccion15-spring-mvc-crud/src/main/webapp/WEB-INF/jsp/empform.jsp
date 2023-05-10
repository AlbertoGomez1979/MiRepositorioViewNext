<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Agregar Empleado</h1>
       <form:form method="post" action="save">  
      	<table >  
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
          <td><input type="submit" value="Guardar" /></td>  
         </tr>  
        </table>  
       </form:form>  
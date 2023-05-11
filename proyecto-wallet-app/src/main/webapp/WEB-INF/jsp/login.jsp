<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="es">

    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <title>Login de usuario</title>
    </head>

    <body>

        <form class="row g-3" method="post" novalidate action="userPage">
            <div class="container" style="max-width: 46%; padding-top: 10%">

                <h1 class="text-center" style="padding-bottom: 4%;">Acceso de usuarios</h1>
                
                    <div class="form-group">
                        <!--Etiquetas con validaciones-->
                        <label for="validationDefault01" class="form-label">Nombre de usuario:</label>
                        <!--El nombre tiene que estar en el id del imput-->
                        <input type="text" class="form-control" id="validationDefault01" pattern="[a-zA-Z0-9]+" name="text" maxlength="50" required>
                    </div>

                    <div class="form-group">
                        <label for="validationDefault02" class="form-label">Contraseña</label>
                        <input type="password" class="form-control" id="validationDefault02" name="password" required>
                    </div>

                   <input class="btn btn-success" type="submit" value="Acceder" style="margin-top: 5px">
                    
                
                    <a href="" style="margin: 45px">Olvidé contraseña</a>

                    <a href="registroUser">Regístrese!!!!</a>
                    
               
            </div>
        </form>

        <!--Librerias necesarias para el método de validación-->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/bootstrap.bundle.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"
            integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE"
            crossorigin="anonymous"></script>
       

    </body>

</html>
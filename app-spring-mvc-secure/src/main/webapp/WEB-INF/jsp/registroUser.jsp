<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="es">

    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css"
        integrity="sha384-b6lVK+yci+bfDmaY1u0zE8YYJt0TZxLEAFyYSLHId4xoVvsrQu3INevFKo+Xir8e" crossorigin="anonymous">
        <title>Registro de usuario</title>
    </head>

    <body>

        <form class="row g-3 needs-validation" style="margin:80px" action="agregar" method="POST" novalidate>
            <div class="container" style="max-width: 40%;  padding-top: 10px">

                <h1 class="text-center" style="padding-bottom: 7%">Registro</h1>
                
                    <div class="form-group">
                        <label for="nombre">Nombre:</label>
                        <input type="text" class="form-control" id="nombre" pattern="[a-zA-z]+" name="nombre" maxlength="50" required>
                        <!--Mensaje de invalidez-->
	                        <div class="invalid-feedback">
	                            Por favor ingrese un nombre válido
	                        </div>
                    </div>

                    <div class="form-group">
                        <label for="nombreusuario">Nombre de usuario</label>
                        <input type="text" class="form-control" id="nombreusuario" name="nombreusuario" maxlength="50" required>
	                        <div class="invalid-feedback">
	                            Por favor ingrese un nombre de usuario.
	                        </div>
                    </div>

                    <div class="form-group">
                        <label for="dni">Dni:</label>
                        <input type="text" class="form-control" id="dni" name="dni" placeholder="45511792F" pattern="[0-9]{8}[a-zA-Z]{1}" maxlength="50" required>
	                        <div class="invalid-feedback">
	                            Por favor ingrese un dni válido.
	                        </div>
                    </div>

                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="email" class="form-control" id="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" name="email" maxlength="50" required>
	                        <div class="invalid-feedback">
	                            Por favor ingrese un email válido.
	                        </div>
                    </div>

                    <div class="form-group">
                        <label for="password_2">Password:</label>
                        <input type="password" class="form-control" id="password_2" name="password_2" placeholder="Introduzca password" minlength="4" required>               
		                        <div class="invalid-feedback">
		                            Por favor ingrese contraseña.
		                        </div>
                    </div>

                    <div class="form-group">
                        <label for="password2">Repita password:</label>
                        <input type="password" class="form-control" id="password2" name="password2" placeholder="Vuelva a introducir password" minlength="4" required>
	                        <div class="invalid-feedback">
	                            Por favor vuelva a ingresar contraseña
	                        </div>
                    </div>


                    <input class="btn btn-success" type="submit" value="Registrarse" style="margin-top: 5%">
         

            </div>
        </form>
        <!--Librerias necesarias para el método de validación-->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/bootstrap.bundle.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js"
            integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE"
            crossorigin="anonymous"></script>
       
       <!--Uso de Javascript para personalizar la validacion 1-->
       <script>   
            (() => {
                'use strict'
    
                //Obtener todos los formularios a los que queremos aplicar estilos de validación de Bootstrap personalizados
                const forms = document.querySelectorAll('.needs-validation')
    
                //Bucle y evita el envío                           
                Array.from(forms).forEach(form => {
                    form.addEventListener('submit', event => {
                        if (!form.checkValidity()) {
                            event.preventDefault()
                            event.stopPropagation()
                        }
    
                        form.classList.add('was-validated')
                    }, false)
                })
            })()
        </script>


       <!-- <script>


        function verificarPasswords(){
                    // Ontenemos los valores de los campos de contraseñas 
                    pass1 = document.getElementById('password1');
                    pass2 = document.getElementById('password2');
    
            // Verificamos si las constraseñas no coinciden 
            if (pass1.value != pass2.value) {
    
                // Si las constraseñas no coinciden mostramos un mensaje 
                document.getElementById("error").classList.add("mostrar");
    
                return false;
            } else {
    
                // Si las contraseñas coinciden ocultamos el mensaje de error
                document.getElementById("error").classList.remove("mostrar");
        
                // Mostramos un mensaje mencionando que las Contraseñas coinciden 
                document.getElementById("ok").classList.remove("ocultar");
        
                // Desabilitamos el botón de login 
                document.getElementById("submit").disabled = true;
        
                // Refrescamos la página (Simulación de envío del formulario) 
                setTimeout(function() {
                    location.reload();
                }, 3000);
        
                return true;
            }
 
         }
        
        </script>   -->
        

        <!--FUNCION PARA VALIDAR EL EMAIL CON JAVASCRIPT SI NO SE USA PATTERN-->
        <!--(() => {
            'use strict';
            const forms = document.querySelectorAll('.needs-validation');
            Array.prototype.slice.call(forms).forEach((form) => {
                form.addEventListener('submit', (event) => {
                    if (!form.checkValidity()) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });

            var email = document.getElementById('email');
            email.oninput = () => {
                const re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
                if (!re.test(email.value)) {
                    email.setCustomValidity("Invalid field.");
                    email.classList.add('invalid');
                } else {
                    email.classList.remove('invalid');
                    email.setCustomValidity("")
                }
            }

        }

        )();-->
  


    </body>
</html>
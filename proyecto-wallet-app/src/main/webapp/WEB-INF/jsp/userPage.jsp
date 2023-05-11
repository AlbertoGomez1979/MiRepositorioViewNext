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
        <title>Página de usuario</title>
    </head>
    
    <body>
        <div class="container">
            <h2>Usuario</h2>
            
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">                   

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        
                        	<li class="nav-item">
                                <a class="nav-link active" href="wallets">Wallets</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="cargar">Cargar fondos</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link active" href="historial">Historial</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link active" href="transfer">Transferencias</a>
                            </li>   
                            
                            <li class="nav-item">
                                <a class="nav-link active" href="login" style="color: red;">Cerrar sesión</a>
                            </li>  
                        </ul>                       
                      
                    </div>
                </div>
            </nav>

                <div class="tabla" style="padding-top: 5%;">
                    <h1 class="text-lg-center">Transacciones</h1>        
                            <h3 class="text-lg-center" style="padding-bottom: 2%;">Últimos 5 movimientos</h3>

                        <table class="table table-striped table-bordered table-primary">
                            <thead>
                                <tr>
                                    <th>Wallet</th>
                                    <th>Estado</th>
                                    <th>Tipo de Transaccion</th>
                                    <th>referencia</th>
                                    <th>monto</th>
                                    <th>concepto</th>
                                    <th>fecha</th>
                                    <th>canal</th>
                                </tr>
                            </thead>
        
                            <tbody>
                                                                                                                                              
                                <c:forEach var="trans" items="${list}">
									<tr>
										<td>${trans.wallet_idwallet}</td>
										<td>${trans.estatusTransaccion_idestatusTransaccion}</td>
										<td>${trans.tipoTransaccion_idtipoTransaccion}</td>
										<td>${trans.referencia}</td>
										<td>${trans.monto}</td>
										<td>${trans.concepto}</td>
										<td>${trans.fecha}</td>
										<td>${trans.canal}</td>																	
									</tr>
								</c:forEach>
                                
                            </tbody>
                        </table>
                </div>

        </div>
        
    </body>
    
    
</html>
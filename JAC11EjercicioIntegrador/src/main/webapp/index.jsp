<%-- 
    Document   : index
    Created on : 22 nov 2023, 18:21:35
    Author     : Usuario
--%>

<%@page import="jose.jac11ejerciciointegrador.logica.Partido"%>
<%@page import="java.util.List"%>
<%@page import="jose.jac11ejerciciointegrador.logica.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JAC11</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <style>
            table {
                width: 80%;
                border-collapse: collapse;
                margin-top: 20px;
            }

            th, td {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            th {
                background-color: #f2f2f2;
            }
        </style>
    </head>
    <body>
        <!-- div Equipo -->
        <div class="container mt-4">
            <h2>Formulario de Equipos</h2>
            <form action="EquipoSv" method="post">
                <div class="form-group">
                    <label for="nombre">Nombre:</label>
                    <input type="text" class="form-control" id="nombreEquipo" name="nombreEquipo">
                </div>
                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>

            <br>
            <form action="EquipoSv" method="get">
                <button type="submit" class="btn btn-primary">Mostrar Equipos</button>
            </form>

            <!-- Div para mostrar Equipo -->
            <div class="results-table">
                <% if (request.getAttribute("resultadosEquipo") != null) { %>
                <h3>Equipos registrados:</h3>
                <table>
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%for (Equipo e : (List<Equipo>) request.getAttribute("resultadosEquipo")) {%>
                        <tr>
                            <td><%= e.getId()%></td>
                            <td><%= e.getNombre()%></td>
                        </tr>
                        <%} %>
                    </tbody>
                </table>
                <%}%>
            </div>
        </div>
        <!-- Div para Partidos -->
        <div class="container mt-4">
            <h2>Formulario de Partidos</h2>
            <form action="PartidoSv" method="post">
                <div class="form-group">
                    <label for="fecha">Fecha:</label>
                    <input type="text" class="form-control" id="fechaPartido" name="fechaPartido">
                </div>
                <div class="form-group">
                    <label for="equipo1">Equipo 1:</label>
                    <input type="text" class="form-control" id="nombreEquipo1" name="nombreEquipo1">
                </div>
                <div class="form-group">
                    <label for="equipo2">Equipo 2</label>
                    <input type="text" class="form-control" id="nombreEquipo2" name="nombreEquipo2">
                </div>
                <div class="form-group">
                    <label for="puntos">Puntuacion:</label>
                    <input type="text" class="form-control" id="puntos" name="puntos">
                </div>
                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>
            <br>
            <form action="PartidoSv" method="get">
                <button type="submit" class="btn btn-primary">Mostrar Partidos</button>
            </form>
            <!-- Div para mostrar Partidos -->
            <div class="results-table">
                <% if (request.getAttribute("resultadosPartido") != null) { %>
                <h3>Partidos registrados:</h3>
                <table>
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Fecha</th>
                            <th>Equipo Local</th>
                            <th>Equipo Visitante</th>
                            <th>Resultado</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%for (Partido e : (List<Partido>) request.getAttribute("resultadosPartido")) {%>
                        <tr>
                            <td><%= e.getId()%></td>
                            <td><%= e.getFecha()%></td>
                            <td><%= e.getEquipo1().getNombre()%></td>
                            <td><%= e.getEquipo2().getNombre()%></td>
                            <td><%= e.getResultado()%></td>
                        </tr>
                        <%} %>
                    </tbody>
                </table>
                <%}%>
            </div>
        </div>
    </body>
</html>

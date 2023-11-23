
<%@page import="java.util.List"%>
<%@page import="jose.jac11d10.logica.Voto"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JAC10D11Ejercicio1</title>
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
        <div class="container mt-4">

            <h1>Votación</h1>
            <form action="VotoSv" method="post">
                <div class="form-group">
                    <input type="radio" name="voto" value="Partido A"> Partido A <br>
                    <input type="radio" name="voto" value="Partido B"> Partido B <br>
                    <input type="radio" name="voto" value="Partido C"> Partido C <br>
                </div>
                <button type="submit" style="background-color: aquamarine">Votar</button>
            </form>
            <br>
            <form action="VotoSv" method="get">
                <button type="submit" style="background-color: chartreuse">Mostrar resultados</button>
            </form>


            <br>
            <br>
            <!<!-- Resultados en tabla -->
            <div class="results-table">
                <%if (request.getAttribute("resultados") != null) {%>
                <h3>Resultados</h3>
                <table>
                    <thead>
                        <tr>
                            <th>Partido</th>
                            <th>Cantidad</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%for (Voto v : (List<Voto>) request.getAttribute("resultados")) {%>
                        <tr>
                            <td><%=v.getPartido()%></td>
                            <td><%= v.getCantidad()%></td>
                        </tr>
                        <%
                                }
                            }
                        %>
                    </tbody>
                </table>
            </div>
        </div>

    </body>
</html>

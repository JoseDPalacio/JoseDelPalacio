
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JAC10D11Ejercicio1</title>
    </head>
    <body>
        <h1>Votación</h1>
        <form action="VotoSv" method="post">
            <input type="radio" name="voto" value="Partido A"> Partido A <br>
            <input type="radio" name="voto" value="Partido B"> Partido B <br>
            <input type="radio" name="voto" value="Partido C"> Partido C <br>
            <br>
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
                    <%
                        Map<String, Integer> resultados = (Map<String, Integer>) request.getAttribute("resultados");
                        
                            for (Map.Entry<String, Integer> entry : resultados.entrySet()) {
                    %>
                    <tr>
                        <td><%= entry.getKey()%></td>
                        <td><%= entry.getValue()%></td>
                    </tr>
                    <%
                            }
                        }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>

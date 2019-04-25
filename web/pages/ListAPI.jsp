<%-- 
    Document   : List
    Created on : 25/04/2019, 08:52:48
    Author     : leonardo
--%>

<%@page import="java.util.Iterator"%>
<%@page import="model.Planets"%>
<%@page import="java.util.List"%>
<%@page import="modelDAO.PlanetsDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Planetas da API STAR WARS</h1>

            <table border="1">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Climate</th>
                        <th>Terrain</th>
                        <th>Films</th>
                    </tr>
                </thead>

                <%
                    PlanetsDAO pl = new PlanetsDAO();
                    List<Planets> list = pl.listarAPI();
                    Iterator<Planets> iter = list.iterator();
                    Planets pla = null;
                    while (iter.hasNext()) {
                        pla = iter.next();

                %>

                <tbody>
                    <tr>
                        <td><%= pla.getId()%></td>
                        <td><%= pla.getName()%></td>
                        <td><%= pla.getClimate()%></td>
                        <td><%= pla.getTerrain()%></td>
                        <td><%= pla.getQtdFilmes()%></td>

                    </tr>

                    <%
                        }
                    %>

                </tbody>

            </table>
        </div>
    </body>
</html>

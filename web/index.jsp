<%@page import="HTTPS.HTTP"%>
<%@page import="modelDAO.PlanetsDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //verificação de dados no banco
//    PlanetsDAO p = new PlanetsDAO();
//    boolean t=false;
//    t = p.inicio();
//    System.out.println("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
//    System.out.println(t);
//    if(t==true){
//        System.out.println("sx");
////        HTTP http = new HTTP();
////        http.Requisicao();
//    }


%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <a href="Control?accion=List">Listar Planetas</a>
        </div>
        <div>
            <a href="Control?accion=ListAPI">Listar Planetas da API</a>
        </div>
        <div>
            <a href="Control?accion=Crea">Adicionar Planeta</a>
        </div>
    </body>
</html>

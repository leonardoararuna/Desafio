

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <h1>Add Planeta</h1>
                <form action="Control">
                    Nome:<br>
                    <input class="form-control" type="text" name="txtNome"><br>
                    Clima: <br>
                    <input class="form-control" type="text" name="txtClima"><br>
                    Terreno:<br>
                    <input class="form-control" type="text" name="txtTerreno"><br>

                    <input class="btn btn-primary" type="submit" name="accion" value="cadastrar">
                    <a href="Control?accion=List">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>
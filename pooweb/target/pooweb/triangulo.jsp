<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>figure</title>
    <link rel="stylesheet" href="assets/css/multi.css">
</head>
<body>
    <div class="padre">
        <div class="child">
            <div class="uno"><div class="child_1"><img src="assets/img/t.png" alt=""></div></div>
            <div class="dos">
                <div class="dos_1">
                    <form action="servlet" method="POST">
                        <label class="formulario" name="baso">ingrese la base:</label>
                        <input class = "formulario" type="number" name="base" id="base" required="required"><br>
                        <label class="formulario" name="alture">ingrese la altura</label>
                        <input class = "formulario" type="number" name="altura" id="altura" required="required"><br>
                        <button class="formulario" type="submit" name="control" value="areatri">Enviar</button>
                        <p>
                            <% if(request.getAttribute("area") != null){ %>
                                El area del triangulo es <%= request.getAttribute("area")%>
                                    <% } %>
                        </p>
                    </form><br>
                    <form action="servlet" method="POST">
                        <label class="formulario" name="baso">ingrese la medida de los lados:</label>
                        <input class = "formulario" type="number" name="lado6" id="lado6" required="required"><br>
                        <button class="formulario" type="submit" name="control" value="peritri">Enviar</button>
                        <p>
                            <% if(request.getAttribute("perimetro") != null){ %>
                                El perimetro del triangulo es <%= request.getAttribute("perimetro")%>
                                    <% } %>
                        </p>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
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
            <div class="uno"><div class="child_1"><img src="assets/img/r.png" alt=""></div></div>
            <div class="dos">
                <div class="dos_1">
                    <form action="servlet" method="post" style="text-align:center; display:flex; flex-direction:column; gap:20px; background-color: aliceblue; padding:20px;">
                        <label class="formulario" name="baso">por favor digite la base de su rectangulo:</label>
                        <input class = "formulario" type="number" name="base" id="base" required="required"><br>
                        <label class="formulario" name="alture">por favor digite la medida de la altura de su rectangulo:</label>
                        <input class = "formulario" type="number" name="altura" id="altura" required="required"><br>
                        <button class="formulario" type="submit" name="control" value="arearec">Enviar</button>
                        <p>
                            <% if(request.getAttribute("area") != null){ %>
                                El area del rectangulo es <%= request.getAttribute("area")%>
                                    <% } %>
                        </p>
                    </form><br>
                    <form action="servlet" method="post" style="text-align:center; display:flex; flex-direction:column; gap:20px; background-color: aliceblue; padding:20px;">
                        <label class="formulario" name="baso">por favor digite la medida de primer lado:</label>
                        <input class = "formulario" type="number" name="lado2" id="lado2" required="required"><br>
                        <label class="formulario" name="baso">por favor digite la medida de segundo lado:</label>
                        <input class = "formulario" type="number" name="lado3" id="lado3" required="required"><br>
                        <button class="formulario" type="submit" name="control" value="perirec">Enviar</button>
                        <p>
                            <% if(request.getAttribute("perimetro") != null){ %>
                                El area del rectangulo es <%= request.getAttribute("perimetro")%>
                                    <% } %>
                        </p>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
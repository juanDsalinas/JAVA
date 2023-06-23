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
            <div class="uno"><div class="child_1"><img src="assets/img/c.png" alt=""></div></div>
            <div class="dos">
                <div class="dos_1">
                    <form action="servlet" method="POST">
                        <h2>Area</h2>
                        <label class="formulario" name="base">Ingrese el valor del radio:</label>
                        <input class = "formulario" type="number" name="radio" id="radio" required="required">
                        <button class="formulario" type="submit" name="control" value="areaci">Enviar</button><br>
                        <p>
                            <% if(request.getAttribute("area") != null){ %>
                                El  area del circulo es <%= request.getAttribute("area")%>
                                    <% } %>
                            </p>
                    </form><br>
                    <h2>Perimetro</h2>
                    <form action="servlet" method="POST">
                        <label class="formulario" name="base">Ingrese el valor del radio</label>
                        <input class = "formulario" type="number" name="lado1" id="lado1" required="required">
                        <button class="formulario" type="submit" name="control" value="pericir">Enviar</button><br>
                        <p>
                            <% if(request.getAttribute("perimetro") != null){ %>
                                El perimetro del circulo es <%= request.getAttribute("perimetro")%>
                                    <% } %>
                        </p>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
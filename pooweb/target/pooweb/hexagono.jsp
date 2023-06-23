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
    <!-- expresiones
    <h2>prueba en java</h2>
    <p><%= new String("Juan david salinas")%>:</p> -->
    <!-- scriplets -->
    <!-- <p><%
        for(int i=0; i<4; i++){
            out.println("<br>Iteracion " +i);
        }
        %>
    </p> -->
    <!-- declaraciones -->
    <!-- <p><%!
        private int res;
    
        public int sumar(int n1, int n2){
            res=n1+n2;    
            return res; 
        }
    
        %></p>
    
    <p>el resultado es <%= sumar(10,90) %></p>  -->
    <div class="padre">
        <div class="child">
            <div class="uno"><div class="child_1"><img src="assets/img/h.png" alt=""></div></div>
            <div class="dos">
                <div class="dos_1">
                    <form action="servlet" method="post">
                        <label class="formulario" name="lade">ingrese el valor del lado de tu Hexagono:</label>
                        <input class = "formulario" type="number" name="lado" id="lado" required="required"><br>
                        <label class="formulario" name="perimetre">ingresa el valor del perimetro de tu hexagono:</label>
                        <input class = "formulario" type="number" name="perimetro" id="perimetro" required="required"><br>
                        <label class="formulario" name="apoteme">ingresa el valor del perimetro de tu hexagono:</label>
                        <input class = "formulario" type="number" name="apotema" id="apotema" required="required"><br>
                        <button class="formulario" type="submit" name="control" value="areahex">Enviar</button>
                        <p>
                            <% if(request.getAttribute("area") != null){ %>
                                El area del hexagono es <%= request.getAttribute("area")%>
                                    <% } %>
                        </p>
                    </form><br>
                    <form action="servlet" method="post">
                        <label class="formulario" name="lade">ingrese el valor del lado:</label>
                        <input class = "formulario" type="number" name="lado9" id="lado9" required="required"><br>
                        <button class="formulario" type="submit" name="control" value="perihex">Enviar</button>
                        <p>
                            <% if(request.getAttribute("perimetro") != null){ %>
                                El area del hexagono es <%= request.getAttribute("perimetro")%>
                                    <% } %>
                        </p>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
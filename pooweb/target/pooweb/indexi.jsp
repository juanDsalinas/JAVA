<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="assets/css/app.css">
</head>
<body>
    <div class="title">
        <div class="ttl">
            <h3>Bienvenido, por favor elija una de la siguientes figuras la cual usted desee saber el valor del area de esta</h3>
        </div>
    </div>
    <div class="padre">
        <div class="caja">
            <div class="cajita 1"><img src="assets/img/c.png" alt="" title="circulo" width="200px" height="200px" ></div>
            <div class="cajita 2"><img src="assets/img/r.png" alt="" title="rectangulo" width="200px" height="200px"></div>
            <div class="cajita 3"><img src="assets/img/t.png" alt="" title="triangulo" width="200px" height="200px"></div>
            <div class="cajita 4"><img src="assets/img/h.png" alt="" title="hexagono" width="200px" height="200px" style="object-fit: contain;"></div>
        </div>
        <div class="child">
            <ul>
                <li><a href="servlet?control=circulo">¡Elegir!</a></li>
                <li><a href="servlet?control=rectangulo">¡Elegir!</a></li>
                <li><a href="servlet?control=triangulo">¡Elegir!</a></li>
                <li><a href="servlet?control=hexagono">¡Elegir!</a></li>
            </ul>
        </div>
    </div>
    <div class="footer">
        <div class="fuu">
            <h4>Gracias por visitar mi projecto, ten un lindo dia :) </h4>
        </div>
    </div>
    <!-- <div class="campos">
        <label class="formulario" for="base">Ingrese la opcion de la figura que quiere calcular:</label>
        <input class = "formulario" type="number" id="opcion">
        <button class="formulario">Enviar</button>
    </div> -->
</body>
</html>
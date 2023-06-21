<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>operacion</title>
    <link rel="stylesheet" href="css/operacion.css">
</head>
<body>
    <div class="encabezado">
        <h1>escoja</h1>
        <p>escoja la figura a la que desea encontrar el area</p>
    </div>
    <div class="hola">
        <div class="figuras">
            <a href="servlet?control=rombo">
                <div class="imagen">
                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBXjVMm6xVA1xP434OAdT1QuGoc9ro2gJrPbLh4ZsV_Md8GK8FYH01AGE6ZLeYyhBnHsY&usqp=CAU" alt="">
                </div>
                <div class="texto">
                    <p>Rombo</p>
                </div>
            </a> 
        </div>
        <div class="figuras">
            <a href="servlet?control=trapecio">
                <div class="imagen">
                    <img src="https://eluniversomatematicoblog.files.wordpress.com/2017/11/trapecio_isosceles.png?w=260&h=142" alt="">
                </div>
                <div class="texto">
                    <p>Trapecio</p>
                </div>
            </a>
        </div>
        <div class="figuras">
            <a href="servlet?control=trianguloR">
                <div class="imagen">
                    <img src="https://matematicasmodernas.com/wp-content/uploads/2013/11/triangulo-rectangulo_bh.png" alt="">
                </div>
                <div class="texto">
                    <p>Triangulo rectangulo</p>
                </div>
            </a>
        </div>
        <div class="figuras">
            <a href="servlet?control=hexagono">
                <div class="imagen">
                    <img src="https://www.decagono.com/img/hexagono.png" alt="">
                </div>
                <div class="texto">
                    <p>hexagono</p>
                </div>
            </a>
        </div>      
    </div>
    </body>
</html>
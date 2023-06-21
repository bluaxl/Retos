<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/forms.css">
    <title>hexagono</title>
</head>
<body>
    <div class="signupFrm">
        <div class="wrapper">
        <form action="servlet" method="post" class="form">
          <h1 class="title">hexagono</h1>
          <p>digite el perimetro del hexagono</p>  
          <div class="inputContainer">
            <input type="text" name="perimetro" id="perimetro" class="input" placeholder="perimetro">
            <label for="" class="label">perimetro</label>
          </div>
          <p>digite el apotema del hexagono</p>  
          <div class="inputContainer">
            <input type="text" name="apotema" id="apotema" iclass="input" placeholder="apotema">
            <label for="" class="label">apotema</label>
          </div>
          <input type="submit" name="Operar" value="hexagono" class="submitBtn" >
        </form>
        </div>
      </div>
</body>
</html>
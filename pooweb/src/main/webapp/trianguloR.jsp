<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/forms.css">
    <title>Triangulo Rectangulo</title>
</head>
<body>
    <div class="signupFrm">
        <div class="wrapper">
        <form action="servlet" class="form">
          <h1 class="title">Triangulo Rectangulo</h1>
          <p>difite la base</p>  
          <div class="inputContainer">
            <input type="text" name="base" class="input" placeholder="base">
            <label for="" class="label">base</label>
          </div>
          <p>digite la altura</p>
          <div class="inputContainer">
            <input type="text" name="h" class="input" placeholder="altura">
            <label for="" class="label">Altura</label>
          </div>
          <input type="submit" name="Operar" class="submitBtn" value="trianguloR">
        </form>
        <p><% req.getAttribute("area")%></p>
        </div>
      </div>
</body>
</html>
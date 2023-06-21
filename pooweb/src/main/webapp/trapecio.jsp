<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/forms.css">
    <title>Trapecio</title>
</head>
<body>
    <div class="signupFrm">
        <div class="wrapper">
        <form action="servlet" class="form">
          <h1 class="title">Trapecio</h1>
          <p>difite la base mayor</p>  
          <div class="inputContainer">
            <input type="text" name="bMayor" class="input" placeholder="base mayor">
            <label for="" class="label">base mayor</label>
          </div>
          <p>digite la base menor</p>
          <div class="inputContainer">
            <input type="text" name="bMenor" class="input" placeholder="base menor">
            <label for="" class="label">base menor</label>
          </div>
          <p>digite la altura</p>
          <div class="inputContainer">
            <input type="text" name="altura" class="input" placeholder="altura">
            <label for="" class="label">Altura</label>
          </div>
          <input type="submit" name="Operar" class="submitBtn" value="trapecio">
        </form>
        </div>
      </div>
</body>
</html>
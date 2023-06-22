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
        <form action="servlet" method="post" class="form">
          <h1 class="title">Triangulo Rectangulo</h1>
          <p>difite la base</p>  
          <div class="inputContainer">
            <input type="text" name="base" class="input" placeholder="base" required>
            <label for="" class="label">base</label>
          </div>
          <p>digite la altura</p>
          <div class="inputContainer">
            <input type="text" name="h" class="input" placeholder="altura" required>
            <label for="" class="label">Altura</label>
          </div>
          <button type="submit" name="Operar" class="submitBtn" value="trianguloR">Area</button>
        </form>
        <p> <%if(request.getAttribute("area")!= null){%>
          El resultado es: <%=request.getAttribute("area")%>
          <%}%>
        </p>
        <form action="servlet" method="post" class="form">
          <h1 class="title">Triangulo Rectangulo</h1>
          <p>digite el primer lado del Triangulo Rectangulo</p>  
          <div class="inputContainer">
            <input type="text" name="lado1" class="input" placeholder="lado 1" required>
            <label for="" class="label">lado 1</label>
          </div>
          <p>digite el segundo lado del Triangulo Rectangulo</p>  
          <div class="inputContainer">
            <input type="text" name="lado2" class="input" placeholder="lado 2" required>
            <label for="" class="label">lado 2</label>
          </div>
          <p>digite el tercer lado del Triangulo Rectangulo</p>  
          <div class="inputContainer">
            <input type="text" name="lado3" class="input" placeholder="lado 3" required>
            <label for="" class="label">lado 3</label>
          </div>
          <button type="submit" name="Operar" class="submitBtn" value="pTrianguloR">Perimetro</button>
        </form>
        <p> <%if(request.getAttribute("perimetro")!= null){%>
          El resultado es: <%=request.getAttribute("perimetro")%>
          <%}%>
        </p>
        </div>
      </div>
</body>
</html>
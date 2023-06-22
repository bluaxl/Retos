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
        <form action="servlet" method="post" class="form">
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
          <button type="submit" name="Operar" class="submitBtn" value="trapecio">Area</button>
        </form>
        <p> <%if(request.getAttribute("area")!= null){%>
          El resultado es: <%=request.getAttribute("area")%>
          <%}%>
        </p>
        <form action="servlet" method="post" class="form">
          <h1 class="title">trapecio</h1>
          <p>digite el primer lado del trapecio</p>  
          <div class="inputContainer">
            <input type="text" name="lado1" id="lado" class="input" placeholder="lado 1">
            <label for="" class="label">lado 1</label>
          </div>
          <p>digite el segundo lado del trapecio</p>  
          <div class="inputContainer">
            <input type="text" name="lado2" id="lado" class="input" placeholder="lado 2">
            <label for="" class="label">lado 2</label>
          </div>
          <p>digite el tercer lado del trapecio</p>  
          <div class="inputContainer">
            <input type="text" name="lado3" id="lado" class="input" placeholder="lado 3">
            <label for="" class="label">lado 3</label>
          </div>
          <p>digite el cuarto lado del trapecio</p>  
          <div class="inputContainer">
            <input type="text" name="lado4" id="lado" class="input" placeholder="lado 4">
            <label for="" class="label">lado 4</label>
          </div>
          <button type="submit" name="Operar" value="pTrapecio" class="submitBtn">Perimetro</button>
        </form>
        <p> <%if(request.getAttribute("perimetro")!= null){%>
          El resultado es: <%=request.getAttribute("perimetro")%>
          <%}%>
        </p>
        </div>
      </div>
</body>
</html>
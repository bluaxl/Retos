<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/forms.css">
    <title>Rombo</title>
</head>
<body>
    <div class="signupFrm">
        <div class="wrapper">
        <form action="servlet" method="post" class="form">
          <h1 class="title">Rombo</h1>
          <p>digite la diagonal mayor</p>  
          <div class="inputContainer">
            <input type="text" name="dMayor" class="input" placeholder="diagonal mayor">
            <label for="" class="label">diagonal mayor</label>
          </div>
          <p>digite la diagonal menor</p>
          <div class="inputContainer">
            <input type="text" name="dMenor" class="input" placeholder="diagonal menor">
            <label for="" class="label">diagonal menor</label>
          </div>
          <button type="submit" name="Operar" class="submitBtn" value="rombo">Area</button>
        </form>
        <p> <%if(request.getAttribute("area")!= null){%>
          El resultado es: <%=request.getAttribute("area")%>
          <%}%>
        </p>
        <form action="servlet" method="post" class="form">
          <h1 class="title">Rombo</h1>
          <p>digite el lado del rombo</p>  
          <div class="inputContainer">
            <input type="text" name="lado" class="input" placeholder="lado">
            <label for="" class="label">lado</label>
          </div>
          <button type="submit" name="Operar" class="submitBtn" value="pRombo">Perimetro</button>
        </form>
        <p> <%if(request.getAttribute("perimetro")!= null){%>
          El resultado es: <%=request.getAttribute("perimetro")%>
          <%}%>
        </p>
        </div>
      </div>
</body>
</html>
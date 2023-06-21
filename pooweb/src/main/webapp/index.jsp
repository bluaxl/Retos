<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/index.css">
    <title>bienvenido</title>
</head>
<body>
    <div class="container">
    <div class="texto">
        <h1>bienvenido</h1>
        <p>
            <%=new String("axl rodriguez")%>
        </p>
        <p>
        <%
            for(int i=0;i<4;i++){
            out.println("<BR>Iteración "+i);
            }
        %>
        </p>
        <p>
            <%!
            private int res;
            
            public int sumar(int n1,int n2){
            res=n1+n2;
            return res;
            }
            %>
            <p> el resultado de la suma es: <%= sumar(15,25) %></p>
    </div>
    <div>
        <a href="operacion.jsp"><button class="boton">Entrar</button></a>
    </div>
    </div>
</html>
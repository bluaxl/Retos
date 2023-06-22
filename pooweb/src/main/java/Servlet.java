import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import figuras.Hexagono;
import figuras.Rombo;
import figuras.Trapecio;
import figuras.TrianguloR;

public class Servlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String control = req.getParameter("control");
        switch(control){
            case "hexagono":
                req.getRequestDispatcher("hexagono.jsp").forward(req, resp);
            break;
            case "rombo":
                req.getRequestDispatcher("rombo.jsp").forward(req, resp);
            break;
            case "trapecio":
                req.getRequestDispatcher("trapecio.jsp").forward(req, resp);
            break;
            case "trianguloR":
                req.getRequestDispatcher("trianguloR.jsp").forward(req, resp);
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Operar = req.getParameter("Operar");
        switch (Operar) {
            case "hexagono":
                double perimetro = Double.parseDouble(req.getParameter("perimetro"));
                double apotema = Double.parseDouble(req.getParameter("apotema"));
                Hexagono hexagono = new Hexagono(perimetro,apotema,0);
                req.setAttribute("area", hexagono.calcularArea());
                req.getRequestDispatcher("hexagono.jsp").forward(req, resp);
                break;
            case "rombo":
                Double dMayor = Double.parseDouble(req.getParameter("dMayor"));
                Double dMenor = Double.parseDouble(req.getParameter("dMenor"));
                Rombo rombo  =  new Rombo(0.0, dMayor, dMenor);
                req.setAttribute("area", rombo.calcularArea());
                req.getRequestDispatcher("rombo.jsp").forward(req, resp);
                break;
            case "trapecio":
                Float bMenor = Float.parseFloat(req.getParameter("bMenor"));
                Float bMayor = Float.parseFloat(req.getParameter("bMyor"));
                Float altura = Float.parseFloat(req.getParameter("altura"));
                Trapecio trapecio = new Trapecio(0,0,0,0,bMenor,bMayor,altura);
                req.setAttribute("area", trapecio.calcularArea());
                req.getRequestDispatcher("trapecio.jsp").forward(req, resp);
                break;
            case "trianguloR":
                Float base = Float.parseFloat(req.getParameter("base"));
                Float h = Float.parseFloat(req.getParameter("h"));
                TrianguloR triangulor = new TrianguloR(0,0,0,base,h);
                req.setAttribute("area", triangulor.calcularArea());
                req.getRequestDispatcher("trianguloR.jsp").forward(req, resp);
            case "pHexagono":
                double lado = Double.parseDouble(req.getParameter("lado"));
                Hexagono pHexagono = new Hexagono(0,0,lado);
                req.setAttribute("perimetro", pHexagono.calcularPerimetro());
                req.getRequestDispatcher("hexagono.jsp").forward(req, resp);
                break;
            case "pRombo":
                double ladoRombo = Double.parseDouble(req.getParameter("lado"));
                Rombo pRombo = new Rombo(ladoRombo, 0.0, 0.0);
                req.setAttribute("perimetro", pRombo.calcularPerimetro());
                req.getRequestDispatcher("rombo.jsp").forward(req, resp);
                break;
            case "pTrapecio":
                double ladoTrapecio1 = Double.parseDouble(req.getParameter("lado1"));
                double ladoTrapecio2 = Double.parseDouble(req.getParameter("lado2"));
                double ladoTrapecio3 = Double.parseDouble(req.getParameter("lado3"));
                double ladoTrapecio4 = Double.parseDouble(req.getParameter("lado4"));
                Trapecio pTrapecio = new Trapecio(ladoTrapecio1, ladoTrapecio2, ladoTrapecio3, ladoTrapecio4, 0.0, 0.0, 0.0);
                req.setAttribute("perimetro", pTrapecio.calcularPerimetro());
                req.getRequestDispatcher("trapecio.jsp").forward(req, resp);
                break;
            case "pTrianguloR":
                double ladoTriangulo1 = Double.parseDouble(req.getParameter("lado1"));
                double ladoTriangulo2 = Double.parseDouble(req.getParameter("lado2"));
                double ladoTriangulo3 = Double.parseDouble(req.getParameter("lado3"));
                TrianguloR pTrianguloR = new TrianguloR(ladoTriangulo1, ladoTriangulo2, ladoTriangulo3, 0.0, 0.0);
                req.setAttribute("perimetro", pTrianguloR.calcularPerimetro());
                req.getRequestDispatcher("trianguloR.jsp").forward(req, resp);
                break;
        }

    }
    
}

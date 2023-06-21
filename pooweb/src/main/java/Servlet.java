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
        System.out.println("el valor de control es: "+ control);
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
        System.out.println("hola si entre");
        String Operar = req.getParameter("Operar");
        switch (Operar) {
            case "hexagono":
                double perimetro = Double.parseDouble(req.getParameter("perimetro"));
                double apotema = Double.parseDouble(req.getParameter("apotema"));
                Hexagono hexagono = new Hexagono(perimetro,apotema);
                req.setAttribute("area", hexagono.calcularArea());
                req.getRequestDispatcher("resultado.jsp").forward(req, resp);
                break;
            case "rombo":
                Float dMayor = Float.parseFloat(req.getParameter("dMayor"));
                Float dMenor = Float.parseFloat(req.getParameter("dMenor"));
                Rombo rombo  =  new Rombo(dMayor,dMenor);
                req.setAttribute("area", rombo.calcularArea());
                req.getRequestDispatcher("resultado.jsp").forward(req, resp);
                break;
            case "trapecio":
                Float bMenor = Float.parseFloat(req.getParameter("bMenor"));
                Float bMayor = Float.parseFloat(req.getParameter("bMyor"));
                Float altura = Float.parseFloat(req.getParameter("altura"));
                Trapecio trapecio = new Trapecio(bMenor,bMayor,altura);
                req.setAttribute("area", trapecio.calcularArea());
                req.getRequestDispatcher("resultado.jsp").forward(req, resp);
                break;
            case "trianguloR":
                Float base = Float.parseFloat(req.getParameter("base"));
                Float h = Float.parseFloat(req.getParameter("h"));
                TrianguloR triangulor = new TrianguloR(base,h);
                req.setAttribute("area", triangulor.calcularArea());
                req.getRequestDispatcher("resultado.jsp").forward(req, resp);
                
            default:
                break;
        }
    }
    
}

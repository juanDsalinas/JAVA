import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Figuras.Circulo;
import Figuras.Hexagono;
import Figuras.Rectangulo;
import Figuras.Triangulo;

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("entro al servlet");
        String control = req.getParameter("control");
        switch (control) {
            case "circulo":
                req.getRequestDispatcher("one.jsp").forward(req, resp);
                break;
            case "rectangulo":
                req.getRequestDispatcher("rectangulo.jsp").forward(req, resp);
                break;
            case "triangulo":
                req.getRequestDispatcher("triangulo.jsp").forward(req, resp);
                break;
            case "hexagono":
                req.getRequestDispatcher("hexagono.jsp").forward(req, resp);
                break;
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String control = req.getParameter("control");
        System.out.println(control);
        switch (control) {
            case "areaci":
                double radio = Double.parseDouble(req.getParameter("radio"));
                Circulo c = new Circulo(radio);
                req.setAttribute("area", c.calcularArea());
                System.out.println("el area del circulo es " + c.calcularArea());
                req.getRequestDispatcher("one.jsp").forward(req, resp);
                break;
            case "arearec":
                double base = Double.parseDouble(req.getParameter("base"));
                double altura = Double.parseDouble(req.getParameter("altura"));
                Rectangulo r = new Rectangulo(base, altura);
                req.setAttribute("area", r.calcularArea());
                System.out.println("area del rectangulo es " + r.calcularArea());
                req.getRequestDispatcher("rectangulo.jsp").forward(req, resp);
                break;
            case "areatri":
                double base2 = Double.parseDouble(req.getParameter("base"));
                double altura2 = Double.parseDouble(req.getParameter("altura"));
                Triangulo t = new Triangulo(base2, altura2);
                req.setAttribute("area", t.calcularArea());
                System.out.println("area del triangulo es " + t.calcularArea());
                req.getRequestDispatcher("triangulo.jsp").forward(req, resp);
                break;
            case "areahex":
                double lado1 = Double.parseDouble(req.getParameter("lado"));
                double perimetro = Double.parseDouble(req.getParameter("perimetro"));
                double apotema = Double.parseDouble(req.getParameter("apotema"));
                Hexagono h = new Hexagono(lado1, perimetro, apotema);
                req.setAttribute("area", h.calcularArea());
                System.out.println("area del hexagono es " + h.calcularArea());
                req.getRequestDispatcher("hexagono.jsp").forward(req, resp);
                break;
            case "pericir":
                double lados = Double.parseDouble(req.getParameter("lado1"));
                Circulo c1 = new Circulo(lados);
                req.setAttribute("perimetro", c1.calcularPerimetro());
                req.getRequestDispatcher("one.jsp").forward(req, resp);
                break;
            case "peritri":
                double lado6 = Double.parseDouble(req.getParameter("lado6"));
                Triangulo t1 = new Triangulo(lado6);
                req.setAttribute("perimetro", t1.calcularPerimetro());
                req.getRequestDispatcher("triangulo.jsp").forward(req, resp);
            case "perirec":
                double lado2 = Double.parseDouble(req.getParameter("lado2"));
                double lado3 = Double.parseDouble(req.getParameter("lado3"));
                Rectangulo r1 = new Rectangulo(lado2, lado3);
                req.setAttribute("perimetro", r1.calcularPerimetro());
                req.getRequestDispatcher("rectangulo.jsp").forward(req, resp);
                break;
            case "perihex":
                double lado9 = Double.parseDouble(req.getParameter("lado9"));
                Hexagono h1 = new Hexagono(lado9);
                req.setAttribute("perimetro", h1.calcularPerimetro());
                req.getRequestDispatcher("hexagono.jsp").forward(req, resp);
                break;
        }

    }

}

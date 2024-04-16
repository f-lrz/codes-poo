package exerFigura;
//import exerFigura.entidades.Figura;
//import exerFigura.entidades.Tipofigura;

public class Programa{
    public static void main(String[] args) throws Exception {
        Figura f1 = new Figura(6, 3, Tipofigura.Retângulo);
        FiguraSTC f2 = new FiguraSTC();
        
        f2.setBase(2);
        f2.setAltura(4);
        f2.setTipo(Tipofigura.Retângulo);
        
        //System.out.println(calcArea(f2.getBase(), f2.getAltura()))
        
    }
}
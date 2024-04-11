package exerFigura.aplicacao;
import exerFigura.entidades.Figura;
import exerFigura.entidades.Tipofigura;

public class Programa{
    public static void main(String[] args) throws Exception {
        Figura f1 = new Figura(6, 3, Tipofigura.Retângulo);
        Figura f2 = new Figura(2, 1, Tipofigura.Triângulo);
        Figura f3 = new Figura(5, 4, Tipofigura.Triângulo);
        Figura f4 = new Figura(7, 4, Tipofigura.Retângulo);
        Figura f5 = new Figura(1, 5, Tipofigura.Retângulo);
        
        f1.imprime();
        f2.imprime();
        f3.imprime();
        f4.imprime();
        f5.imprime();
    }
}

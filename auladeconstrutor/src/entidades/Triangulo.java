package entidades;
public class Triangulo {
    private double a, b, c;
	  
    public Triangulo() {
        a = 1;
        b = 1;
        c = 1;
    }

    public Triangulo(double x) {
        a = x;
        b = x;
        c = x;
    }

	public Triangulo(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double calculaArea() {
	    double sp = (a+b+c) / 2.0; //calculando o semiperímetro
	    return Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c) ); // fórmula de Heron    	
	}	
}

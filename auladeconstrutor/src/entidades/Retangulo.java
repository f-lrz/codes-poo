package entidades;

public class Retangulo {
    private double base;
	private double altura;
	  
	public Retangulo() {
	    base = 1;
	    altura = 1;
	}
	  
    public Retangulo(double x) {
        base = x;
        altura = x;
    }

	public Retangulo(double base, double altura) {
	    this.base = base;
	    this.altura = altura;
	}
	  
	public double calculaArea() {
	    return base * altura;
	}
}


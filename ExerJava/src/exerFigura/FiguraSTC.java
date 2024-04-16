package exerFigura;

public class FiguraSTC {
	private static double base;
	private static double altura;
	private static Tipofigura tipo;
	
	public FiguraSTC() {
		base = 0;
		altura = 0;
		tipo = null;
	}
	
	public static double getBase() {
		return base;
	}
	public static void setBase(double base) {
		FiguraSTC.base = base;
	}

	public static double getAltura() {
		return altura;
	}
	public static void setAltura(double altura) {
		FiguraSTC.altura = altura;
	}

	public static Tipofigura getTipo() {
		return tipo;
	}
	public static void setTipo(Tipofigura tipo) {
		FiguraSTC.tipo = tipo;
	}

	public static void imprime() {
		System.out.println("area: " );
	}
	
	
	public static double calcArea(double base, double altura, Tipofigura tipo) {
		if (tipo == Tipofigura.Retângulo) return base * altura;
		else return (base * altura) / 2;
	}
}


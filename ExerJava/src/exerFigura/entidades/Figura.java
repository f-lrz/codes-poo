package exerFigura.entidades;

//import exerFigura.entidades.Tipofigura;

public class Figura {
	private static int quantFig;
    private int base;
    private int alt;
    private int area;
    private Tipofigura tipo;

    public Figura(int base, int alt, Tipofigura tipo){
        setBase(base);
        setAlt(alt);
        calculaArea();
        setTipo(tipo);
        quantFig++;
    }

    
    public int getBase(){
        return base;
    }
    public void setBase(int base){
        this.base = base;
    }

    public int getAlt(){
        return alt;
    }
    public void setAlt(int alt){
        this.alt = alt;
    }

    public Tipofigura getTipo(){
        return tipo;
    }
    public void setTipo(Tipofigura tipo){
        this.tipo = tipo;
    }
    
    public int getArea() {
    	return area;
    }
    public void setArea(int area){
        this.area = area;
    }
    
    public static int getQuantFig(){
    	return quantFig;
    }
    public static void setQuantFig(int n){
    	quantFig = n;
    }

    private void calculaArea(){
        if(Tipofigura.Retângulo == tipo) area = base * alt;
        else area = (base * alt) / 2;
    }
    
    public void imprime(){
    	System.out.println("Base: " + getBase());
    	System.out.println("Altura: " + getAlt());
    	System.out.println("Tipo: " + getTipo());
    	System.out.println("Area: " + getArea());
    	System.out.println("Quantidades de instanciações: " + getQuantFig());

    }
}

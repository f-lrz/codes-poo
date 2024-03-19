package exerponto;

public class Ponto {
    private int x; 
    private int y;  
    private int z;   
    
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Ponto(int x, int y, int z){
        this(x, y);
        this.z = z;
    }

    public Ponto(){
        this(0, 0, 0);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x){
        this.x = x; 
    }
    
    public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

    public double dist_dois_pontos(Ponto p){

        double e = Math.pow((p.x-this.x), 2) + Math.pow((p.y-this.y), 2) + Math.pow((p.z-this.z), 2);

        return Math.sqrt(e);
    }
}
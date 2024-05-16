package entidades;

public class Livro extends Material{
	private int anodelanc;
	
	public Livro(int cod, String descr, int anodelanc) {
		super(cod, descr);
		setAnodelanc(anodelanc);
	}

	public int getAnodelanc() {
		return anodelanc;
	}

	public void setAnodelanc(int anodelanc) {
		this.anodelanc = anodelanc;
	}
	
	
}

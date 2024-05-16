package entidades;

public class Material {
	private int cod;
	private String descr;
	
	public Material(int cod, String descr) {
		setCod(cod);
		setDescr(descr);
	}

	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	
}

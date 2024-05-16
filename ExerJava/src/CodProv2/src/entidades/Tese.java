package entidades;

public class Tese extends Material{
	private int datadeaprov;
	
	public Tese(int cod, String descr, int datadeaprov) {
		super(cod, descr);
		setDatadeaprov(datadeaprov);
	}
	
	public int getDatadeaprov() {
		return datadeaprov;
	}

	public void setDatadeaprov(int datadeaprov) {
		this.datadeaprov = datadeaprov;
	}
	
	
}

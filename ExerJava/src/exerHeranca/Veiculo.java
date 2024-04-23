package exerHeranca;

public class Veiculo {
	private int veloc;
	private int passag;
	
	public Veiculo(int veloc, int passag) {
		this.veloc = veloc;
		this.passag = passag;
	}

	public int getVeloc() {
		return veloc;
	}
	public void setVeloc(int veloc) {
		this.veloc = veloc;
	}
	public int getPassag() {
		return passag;
	}
	public void setPassag(int passag) {
		this.passag = passag;
	}
}

package exerHeranca;

public class Aviao extends Veiculo {
	private int assentos;
	private String modelo;
	
	public Aviao(int veloc, int passag, int assentos, String modelo) {
		super(veloc, passag);
		this.assentos = assentos;
		this.modelo = modelo;
	}
	
	public int getAssentos() {
		return assentos;
	}
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}

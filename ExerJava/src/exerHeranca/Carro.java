package exerHeranca;

public class Carro extends Veiculo {
	private int portas;
	private int ano;
	
	public Carro(int veloc, int passag, int portas, int ano) {
		super(veloc, passag);
		this.portas = portas;
		this.ano = ano;
	}
	
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}

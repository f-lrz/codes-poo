package exerListObj;

public class Veiculo {
	
	private String placa;
	private int ano;
	private double preco;
	
	public Veiculo(String placa, int ano, double preco) {
		setPlaca(placa);
		setAno(ano);
		setPreco(preco);
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return String.join(System.getProperty("line.separator"), this.placa + " " + this.ano + " " + this.preco);
	}
	
	
}

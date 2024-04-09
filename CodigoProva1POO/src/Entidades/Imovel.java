package Entidades;

public class Imovel {
	private int numero;
	private double preco;
	private Proprietario[] p;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Proprietario getP(int v) {
		return p[v];
	}
	public void setP(int v, String nome, int idade) {
		p[v].setNome(nome);
		p[v].setIdade(idade);
	}
	
	public Imovel(int numero, double preco, String nome1, String nome2, int idade1, int idade2){
		setNumero(numero);
		setPreco(preco);
		p = new Proprietario[2];
		p[0] = new Proprietario(nome1, idade1);
		p[1] = new Proprietario(nome2, idade2);
	}
}

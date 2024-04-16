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
	
	public Imovel(int numero, double preco, int np, String[] nmp, int[] iddp){
		setNumero(numero);
		setPreco(preco);
		p = new Proprietario[np];
		String nm;
		int idd;
		for(int i = 0; i < np; i++){
			nm = nmp[i];
			idd = iddp[i];
			p[i] = new Proprietario(nm, idd);
		}
	}
}

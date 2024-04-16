package Entidades;

public class Contrato {
    private int numero;
	private int ano;
	private Imovel i;
	private double valorcorretagem;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Imovel getI() {
		return i;
	}
	public void setI(Imovel i) {
		this.i = i;
	}
	
	public double getValorcorretagem() {
		return valorcorretagem;
	}
	public void setValorcorretagem(double valorcorretagem) {
		this.valorcorretagem = valorcorretagem;
	}
	
	public void calculacorretagem(double precoI) {
		if(ano >= 2022 || precoI >= 1000000) valorcorretagem = precoI * 0.05;
		else valorcorretagem = precoI * 0.1;
	}
	
	
	public Contrato(int numeroC, int ano, int numeroI, double preco, String nome1, int idade1, String nome2, int idade2) {
		numero = numeroC;
		this.ano = ano;
		calculacorretagem(preco);
		i = new Imovel(numeroI, preco, nome1, nome2, idade1, idade2);
	}
	
	/*public Contrato(int numeroC, int numeroI, double preco, String nome1, int idade1, String nome2, int idade2) {
		numero = numeroC;
		this.ano = 2024;
		calculacorretagem(preco);
		i = new Imovel(numeroI, preco, nome1, nome2, idade1, idade2);
	}*/
	
	public void imprimeContrato() {
		System.out.println("Numero do contrato: " + numero);
		System.out.println("Ano do contrato: " + ano);
		System.out.println("Numero do imovel: " + i.getNumero());
		System.out.println("Preco do imovel: " + i.getPreco());
		System.out.println("Valor da corretagem: " + valorcorretagem);
		System.out.println("Nome e idade do proprietario 1: " + i.getP(0).getNome() + ", " + i.getP(0).getIdade());
		System.out.println("Nome e idade do proprietario 2: " + i.getP(1).getNome() + ", " + i.getP(1).getIdade());
		System.out.println();
	}
}

package Entidades;

public class Proprietario {
	private String nome;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Proprietario(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
}

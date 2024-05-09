package Entidades;

public class Animal {
    private String nome;

    public Animal(String nome){
        setNome(nome);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void emiSom(){
        System.out.println(getNome() + " faz som");
    }
}

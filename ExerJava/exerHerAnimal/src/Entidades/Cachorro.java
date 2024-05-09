package Entidades;

public class Cachorro extends Animal{
    private int peso;

    public Cachorro(String nome, int peso){
        super(nome);
        setPeso(peso);
    }

    public int getPeso(){
        return peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }

    @Override
    public void emiSom(){
        System.out.println(getNome() + " faz auau!");
    }
}

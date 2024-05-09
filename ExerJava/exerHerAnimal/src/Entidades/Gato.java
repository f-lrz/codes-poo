package Entidades;

public class Gato extends Animal{
    private int altura;

    public Gato(String nome, int altura){
        super(nome);
        setAltura(altura);
    }

    public int getAltura(){
        return altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }

    @Override
    public void emiSom(){
        System.out.println(getNome() + " faz miau!");
    }
}

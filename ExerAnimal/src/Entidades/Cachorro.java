package ExerAnimal.Entidades;

public class Cachorro extends Animal{
    private int peso;

    public Cachorro(String nome, int anodenasc, int peso){
        super(nome, anodenasc);
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

    /*@Override
    public void imprime(){

    }*/
}

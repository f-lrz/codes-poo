package ExerAnimal.Entidades;

public class Gato extends Animal{
    private int altura;

    public Gato(String nome, int anodenasc, int altura){
        super(nome, anodenasc);
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

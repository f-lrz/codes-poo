package ExerAnimal.Entidades;

public abstract class Animal {
    private String nome;
    private int anodenasc;
    private final int idade = 5;

    public Animal(String nome, int anodenasc){
        setNome(nome);
        setAnodenasc(anodenasc);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getAnodenasc(){
        return anodenasc;
    }
    public void setAnodenasc(int anodenasc){
        this.anodenasc = anodenasc;
    }
    public int getIdade(){
        return idade;
    }

    public abstract void emiSom();
    
    public final void imprime(){
        System.out.println("Animal: " + getNome());
        System.out.println("Ano de nascimento: " + getAnodenasc());
    }
}

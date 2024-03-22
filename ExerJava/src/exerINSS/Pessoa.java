package exerINSS;

public class Pessoa{
    private String nome;
    private int anodn;
    private int idade;
    private double salario;
    private double INSS;

    public Pessoa(String nome, int anodn, int anoatu, double salario){
        this.nome = nome;
        this.anodn = anodn;
        idade = anoatu - anodn;
        this.salario = salario;
        INSS = calcINSS();
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAnodn(){
        return anodn;
    }
    public void setAnodn(int anodn){
        this.anodn = anodn;
    }

    public int getIdade(int anoatu){
        return anoatu - anodn;
    }
    public void setIdade(int anoatu, int anodn){
        idade = anoatu - anodn;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getInss(){
        return INSS;
    }
    public void setInss(double INSS){
        this.INSS = INSS;
    }

    private double calcINSS(){
        if(salario <= 1412) return salario * 0.075;
        else if(salario <= 2666.68) return salario * 0.09;
        else if(salario <= 4000.03) return salario * 0.12;
        else if(salario <= 7786.02) return salario * 0.14;
        else return 7786.02 * 0.14;
    }

    public void imprimedados(){
        System.out.println("\n\nNome: " + nome);
        System.out.println("Ano de Nascimento: " + anodn);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("INSS: " + INSS);

    }
}
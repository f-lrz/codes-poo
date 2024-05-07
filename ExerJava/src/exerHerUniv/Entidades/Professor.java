package exerHerUniv.Entidades;

import java.time.LocalDate;

public class Professor extends Pessoa{
    private String titulacao;
    private double salario;
    
    public Professor(String nome, int anodenasc, String titulacao, double salario){
        super(nome, anodenasc);
        setTitulacao(titulacao);
        setSalario(salario);
    }

    public String getTitulacao(){
        return titulacao;
    }
    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }


}

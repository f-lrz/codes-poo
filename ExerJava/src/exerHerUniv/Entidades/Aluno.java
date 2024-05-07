package exerHerUniv.Entidades;

import java.time.LocalDate;

public class Aluno extends Pessoa {
    private double mensalidade;
    private double desconto;

    public Aluno(String nome, int anodenasc, double mensalidade, double desconto){
        super(nome, anodenasc);
        setMensalidade(mensalidade);
        setSalario(desconto);
    }

    public double getMensalidade(){
        return mensalidade;
    }
    public void setMensalidade(double mensalidade){
        this.mensalidade = mensalidade;
    }
    public double getDesconto(){
        return desconto;
    }
    public void setSalario(double desconto){
        this.desconto = desconto;
    }
}

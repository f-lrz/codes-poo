package exerHerUniv.Entidades;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private double valorHora;
    private int qnteHoras;

    public Funcionario(String nome, LocalDate datadenasc, double valorHora, int qnteHoras){
        super(nome, datadenasc);
        setValorHora(valorHora);
        setQnteHoras(qnteHoras);
    }

    public double getValorHora(){
        return valorHora;
    }
    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }
    public int getQnteHoras(){
        return qnteHoras;
    }
    public void setQnteHoras(int qnteHoras){
        this.qnteHoras = qnteHoras;
    }

    public double calcSalario(){
        return getValorHora() * getQnteHoras();
    }
}

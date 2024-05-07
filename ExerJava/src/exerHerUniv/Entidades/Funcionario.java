package exerHerUniv.Entidades;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private double valorhora;
    private int qntehoras;

    public Funcionario(String nome, int anodenasc, double valorhora, int qntehoras){
        super(nome, anodenasc);
        setValorhora(valorhora);
        setQntehoras(qntehoras);
    }

    public double getValorhora(){
        return valorhora;
    }
    public void setValorhora(double valorhora){
        this.valorhora = valorhora;
    }
    public int getQntehoras(){
        return qntehoras;
    }
    public void setQntehoras(int qntehoras){
        this.qntehoras = qntehoras;
    }

    public double calcSalario(){
        return getValorhora() * getQntehoras();
    }
}

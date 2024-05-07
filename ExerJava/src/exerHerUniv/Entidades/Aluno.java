package exerHerUniv.Entidades;

import java.time.LocalDate;

public class Aluno extends Pessoa {
    private double mensalidade;
    private double desconto;

    public Aluno(String nome, LocalDate datadenasc, double mensalidade, double desconto){
        super(nome, datadenasc);
        setMensalidade(mensalidade);
        setDesconto(desconto);
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
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    public double calculaPagamento() {
		return getMensalidade() - getDesconto();
	}
}

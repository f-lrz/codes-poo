package exerHerUniv.Entidades;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private int idade;
    private LocalDate datadenasc;
    

    public Pessoa(String nome, LocalDate datadenasc){
        setNome(nome);
        setDatadenasc(datadenasc);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public LocalDate getDatadenasc(){
        return datadenasc;
    }
    public void setDatadenasc(LocalDate datadenasc){
        this.datadenasc = datadenasc;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public void calcIdade(){
        LocalDate agora = LocalDate.now();
        setIdade(agora.getYear() - getDatadenasc().getYear());
    }

}

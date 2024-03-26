package exerPessoaVeiculo;

import javax.print.attribute.SupportedValuesAttribute;

public class Pessoa {

    private String nome;
    private int anodn;
    private int idade;

    public Pessoa(String nome, int anodn){
        this.nome = nome;
        this.anodn = anodn;
        this.idade = 2024 - anodn;
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

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }


    public void ligaVeic(Veiculo v){
        System.out.println("Nome da pessoa: " + nome + "\n");
        v.setStatus(1);
        v.imprime();
    }
    public void desligaVeic(Veiculo v){
        System.out.println("Nome da pessoa: " + nome + "\n");
        v.setStatus(0);
        v.imprime();
    }

    public void aceleraVeic(Veiculo v, int aumento){
        int nv;
        System.out.println("Nome da pessoa: " + nome + "\n");
        nv = v.getVeloc(v) + aumento;
        v.setVeloc(nv);
        v.imprime();
    }
    public void desaceleraVeic(Veiculo v, int reducao){
        int nv;
        nv = v.getVeloc(v) - reducao;
        if(getVeloc(v) > 0){
            System.out.println("O veiculo ja esta parado.");
            return;
        }
        else if(nv > 0){
            System.out.println("Nao foi possivel desacelerar o veiculo");
            return;
        }
        System.out.println("Nome da pessoa: " + nome + "\n");
        v.setVeloc(nv);
        v.imprime();
    }
}

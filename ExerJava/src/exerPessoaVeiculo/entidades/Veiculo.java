package entidades;

public class Veiculo {

    private String placa;
    private double preço;
    private int ano;
    private int veloc;
    private int status;

    public Veiculo(String placa, double preço, int ano){
        this.placa = placa;
        this.preço = preço;
        this.ano = ano;
        veloc = 0;
        status = 0;
    }

    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public double getPreço(){
        return preço;
    }
    public void setPreço(double preço){
        this.preço = preço;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public int getVeloc(){
        return veloc;
    }
    public void setVeloc(int veloc){
        this.veloc = veloc;
    }

    public int getStatus(){
        return status;
    }
    public void setStatus(int status){
        this.status = status;
    }

    public void imprime(){
        System.out.println("Placa: " + placa);
        System.out.println("Preço: R$" + preço);
        System.out.println("Ano: " + ano);
        System.out.println("Veloc: " + veloc + "km");
        if (status == 1) System.out.println("Status: Ligado");
        else System.out.println("Status: Desligado");
        System.out.println();
    }
    
}

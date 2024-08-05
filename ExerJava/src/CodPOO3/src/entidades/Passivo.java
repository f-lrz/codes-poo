package entidades;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Passivo extends Telemarketing{
	private int tipo;
	private String demanda;
	private APassivo a;
	
	public Passivo(int iD, LocalDate datadalig, String atendente, String nomecliente, int CPFcliente, int tipo, String demanda) throws IOException {
		super(iD, datadalig, atendente, nomecliente, CPFcliente);
		this.tipo = tipo;
		this.demanda = demanda;
		a = new APassivo(iD, nomecliente);
		a.criaarq();
		a.gravaBuffered(tipo, demanda);
		a.leBuffered(demanda);
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getDemanda() {
		return demanda;
	}
	public void setDemanda(String demanda) {
		this.demanda = demanda;
	}
	
	
	public void criaarq() throws IOException {
        File arq = new File(getC().getNome());
        if (arq.createNewFile()) {
            System.out.println("Arquivo: " + getC().getNome() + " criado.\n");
        }
        else System.out.println("Arquivo já existe, " + arq.getAbsoluteFile());
    }
	
	public void gravaBuffered(int tipo) throws IOException {
        BufferedWriter b = new BufferedWriter(new FileWriter(getC().getNome(), true));

        if(tipo == 1) 
        	b.write("Cliente fez um elogio.\n");
        if(tipo == 2)
        	b.write("Cliente fez uma reclamação.\n");
        if(tipo == 3)
        	b.write("Cliente trouxe uma informação.\n");
        
        b.close();
        
        System.out.println("Quantidades de caracteres da mensagem: " + demanda.length());

    }
}

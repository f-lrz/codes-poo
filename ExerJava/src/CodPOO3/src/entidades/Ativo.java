package entidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ativo extends Telemarketing{
	private boolean aceita;
	private AAtivo a;
	
	public Ativo(int iD, LocalDate datadalig, String atendente, String nomecliente, int CPFcliente, boolean aceita) throws IOException {
		super(iD, datadalig, atendente, nomecliente, CPFcliente);
		this.aceita = aceita;
		a = new AAtivo(iD, nomecliente);
		a.criaarq();
		a.gravaBuffered(aceita);
		a.leBuffered(datadalig);
	}

	public boolean isAceita() {
		return aceita;
	}

	public void setAceita(boolean aceita) {
		this.aceita = aceita;
	}
	
	public void criaarq() throws IOException {
        File arq = new File(getC().getNome());
        if (arq.createNewFile()) {
            System.out.println("Arquivo: " + getC().getNome() + " criado.\n");
        }
        else System.out.println("Arquivo já existe, " + arq.getAbsoluteFile());
    }
	
	public void gravaBuffered(boolean aceita) throws IOException {
        BufferedWriter b = new BufferedWriter(new FileWriter(getC().getNome(), true));

        if(aceita) 
        	b.write("Cliente aceitou a oferta.\n");
        else b.write("Cliente nao aceitou a oferta.\n");
        
        b.close();

    }
	
	public void leBuffered() throws IOException {
        BufferedReader b = new BufferedReader(new FileReader(getC().getNome()));

        String S;
        System.out.println("\n");

        while((S = b.readLine()) != null)
            System.out.println(S);

        b.close();
        
        long dif = ChronoUnit.DAYS.between(LocalDate.now(), getDatadalig());
        
        System.out.println("Dias entre hoje e a ligacao: " + dif);
        
        
    }

}

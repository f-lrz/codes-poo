package entidades;

import java.io.*;
//import java.nio.Buffer;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AAtivo extends Arquivo{
	
	public AAtivo(int iD, String nome) {
		super(iD, nome);
		
	}
	
	public void criaarq() throws IOException {
        File arq = new File(getNome());
        if (arq.createNewFile()) {
            System.out.println("Arquivo: " + getNome() + " criado.\n");
        }
        else System.out.println("Arquivo já existe, " + arq.getAbsoluteFile());
    }
	
	public void gravaBuffered(boolean aceita) throws IOException {
        BufferedWriter b = new BufferedWriter(new FileWriter(getNome(), true));

        if(aceita) 
        	b.write("Cliente aceitou a oferta.\n");
        else b.write("Cliente nao aceitou a oferta.\n");
        
        b.close();

    }
	
	public void leBuffered(LocalDate d) throws IOException {
        BufferedReader b = new BufferedReader(new FileReader(getNome()));

        String S;
        System.out.println("\n");

        while((S = b.readLine()) != null)
            System.out.println(S);

        b.close();
        
        long dif = ChronoUnit.DAYS.between(LocalDate.now(), d);
        
        System.out.println("Dias entre hoje e a ligacao: " + dif);
        
        
    }
	
	
	
}

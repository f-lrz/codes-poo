package entidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class APassivo extends Arquivo{

	public APassivo(int iD, String nome) {
		super(iD, nome);
		
	}
	
	public void criaarq() throws IOException {
        File arq = new File(getNome());
        if (arq.createNewFile()) {
            System.out.println("Arquivo: " + getNome() + " criado.\n");
        }
        else System.out.println("Arquivo já existe, " + arq.getAbsoluteFile());
    }
	
	public void gravaBuffered(int tipo, String de) throws IOException {
        BufferedWriter b = new BufferedWriter(new FileWriter(getNome(), true));

        if(tipo == 1) 
        	b.write("Cliente fez um elogio.\n");
        if(tipo == 2)
        	b.write("Cliente fez uma reclamação.\n");
        if(tipo == 3)
        	b.write("Cliente trouxe uma informação.\n");
        
        b.close();
        
        System.out.println("Quantidades de caracteres da mensagem: " + de.length());

    }
	
	public void leBuffered(String de) throws IOException {
        BufferedReader b = new BufferedReader(new FileReader(getNome()));

        String S;
        System.out.println("\n");

        while((S = b.readLine()) != null)
            System.out.println(S);

        b.close();
        
        System.out.println("Quantidades de caracteres da mensagem: " + de.length());
        
        
    }

}

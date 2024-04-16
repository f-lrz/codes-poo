package Aplicacao;

import Entidades.*;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantsc;
        Contrato[] c;

        System.out.println("Informe o numero de contratos desejados:");
        quantsc = sc.nextInt();
        c = new Contrato[quantsc];

        for(int i = 0; i < quantsc; i++){
            
            int nc;
            System.out.println("Informe o numero do contrato:");
            nc = sc.nextInt();

            String anosn;
            System.out.println("Deseja informar o ano? s/n");
            anosn = sc.next();

            int ano;
            if(anosn == "s") ano = sc.nextInt();
            else ano = 2024;

            int ni;
            System.out.println("Informe o numero do imovel:");
            ni = sc.nextInt();

            double preco;
            System.out.println("Informe o preco do imovel:");
            preco = sc.nextDouble();

            int np;
            System.out.println("Informe o numero de proprietarios do imovel:");
            np = sc.nextInt();
            
            String nomep;
            int idadep;
            String nmp[];
            int iddp[];
            for(int j = 0; j < np; j++){
                System.out.println("Informe o nome do proprietario " + j+1 + ":");
                nomep = sc.nextLine();
                System.out.println("Informe a idade do proprietario " + j+1 +":");
                idadep = sc.nextInt();
                nmp[np] = nomep;
                iddp[np] = idadep;
            }

            c[i] = new Contrato(nc, ano, ni, preco, np, nmp, iddp);

        }

		//Contrato c1 = new Contrato(123, 2018, 111, 900000,/* 2, */ "Joao", 26, "Maria",  27);
		//Contrato c2 = new Contrato(456, 2022, 222, 1000000,/* 2, */ "Jose", 29, "Marta", 24);
		//Contrato c3 = new Contrato(789, 333, 1300000, /*2, */"Pedro", 43, "Rosane", 41);
		
		for(int i = 0; i < quantsc; i++){
            c[i].imprimeContrato();
            System.out.println();
        }
        
        sc.close();
	}
}

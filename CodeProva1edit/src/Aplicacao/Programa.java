package Aplicacao;

import Entidades.*;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtsc;
        Contrato[] c;

        System.out.println("Informe o numero de contratos desejados:");
        qtsc = sc.nextInt();
        c = new Contrato[qtsc];

        for(int i = 0; i < qtsc; i++){
            
            int nc;
            System.out.println("Informe o numero do contrato:");
            nc = sc.nextInt();

            char anosn;
            System.out.println("Deseja informar o ano? s/n");
            anosn = sc.next().charAt(0);

            int ano;
            if(anosn == 's') ano = sc.nextInt();
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
            
            String[] nmp = new String[np];
            int[] iddp = new int[np];
            
            for(int j = 0; j < np; j++){
                System.out.println("Informe o nome do proprietario " + j+1 + " e logo apos, sua idade:");
                nomep = sc.nextLine();
                idadep = sc.nextInt();
                nmp[j] = nomep;
                iddp[j] = idadep;
            }

            c[i] = new Contrato(nc, ano, ni, preco, np, nmp, iddp);

        }

		//Contrato c1 = new Contrato(123, 2018, 111, 900000,/* 2, */ "Joao", 26, "Maria",  27);
		//Contrato c2 = new Contrato(456, 2022, 222, 1000000,/* 2, */ "Jose", 29, "Marta", 24);
		//Contrato c3 = new Contrato(789, 333, 1300000, /*2, */"Pedro", 43, "Rosane", 41);
		
		for(int i = 0; i < qtsc; i++){
            c[i].imprimeContrato();
            System.out.println();
        }
        
        sc.close();
	}
}

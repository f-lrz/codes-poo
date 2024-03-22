package exerINSS;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) throws Exception {
        Pessoa p;
        Scanner sc = new Scanner(System.in);

        String nome;
        int anodn, anoatu;
        double salario;

        System.out.print("Infome o nome: ");
        nome = sc.nextLine();
        System.out.println("\nInfome o ano de nascimento: ");
        anodn = sc.nextInt();
        System.out.println("\nInfome o salario: ");
        salario = sc.nextDouble();
        System.out.println("\nInfome o ano atual: ");
        anoatu = sc.nextInt();

        p = new Pessoa(nome, anodn, anoatu, salario);

        p.imprimedados();
        
        sc.close();
    }
}
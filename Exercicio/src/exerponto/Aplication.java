package exerponto;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) throws Exception {
        Ponto p1;
        Ponto p2;

        int x, y, z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os valores de x, y, e z do ponto 1:");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        p1 = new Ponto(x, y, z);

        System.out.println("Agora informe os valores de x, y, e z do ponto 2:");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        p2 = new Ponto(x, y, z);

        System.out.println("P1: x=" + p1.getX() + ", y=" + p1.getY() + ", z=" + p1.getZ() + ".");
        System.out.println("P2: x=" + p2.getX() + ", y=" + p2.getY() + ", z=" + p2.getZ() + ".");
        System.out.println("\nA distancia entre os dois pontos sao " + p1.dist_dois_pontos(p2));
    }
}

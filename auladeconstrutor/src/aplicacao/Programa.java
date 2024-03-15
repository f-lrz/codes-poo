package aplicacao;

import java.util.Scanner;

import entidades.Retangulo;
import entidades.Triangulo;

public class Programa {
    public static void main(String[] args) throws Exception {
        Triangulo t1, t2;
        Retangulo ret;

        double t_area1, t_area2, r_area;
        double l1, l2, l3;
        double b, h;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os lados do primeiro triângulo: ");
		l1 = sc.nextDouble();
		l2 = sc.nextDouble();
		l3 = sc.nextDouble();
		t1 = new Triangulo(l1, l2, l3);

        t_area1 = t1.calculaArea();

        System.out.println("Digite os lados do segundo triângulo: ");
		l1 = sc.nextDouble();
		l2 = sc.nextDouble();
		l3 = sc.nextDouble();
		t2 = new Triangulo(l1, l2, l3);

        t_area2 = t2.calculaArea();


        System.out.printf("Área do primeiro triângulo : %.2f%n", t_area1);
		System.out.printf("Área do segundo triângulo : %.2f%n", t_area2);

        //-----------------------------------------------------------------

        System.out.println("Digite a base e a altura do retângulo: ");
        b = sc.nextDouble();
		h = sc.nextDouble();
        ret = new Retangulo(b, h);

        r_area = ret.calculaArea();
        System.out.printf("Área do retângulo : %.2f%n", r_area);

        sc.close();
    }
}

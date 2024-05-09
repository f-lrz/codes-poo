package Programa;
import java.util.ArrayList;

import Entidades.*;

public class Aplicacao {
    public static void main(String[] args){
        Animal ani = new Animal("Aguia");
        Cachorro c1 = new Cachorro("Thor", 12);
        Gato g1 = new Gato("Binho", 35);

        ani.emiSom();
        c1.emiSom();
        g1.emiSom();

        Animal ani2 = new Cachorro("Leid", 7);
        ani2.emiSom();

        ani = c1;

        if(ani instanceof Gato){
            Gato g2 = (Gato) ani;
            g2.setAltura(35);
            System.out.println(g2.getAltura());
        }

        ArrayList <Animal> animais = new ArrayList<Animal>();
        animais.add(new Cachorro("Jack", 10));
        animais.add(new Gato("Mimosa", 23));
        animais.add(new Cachorro("Fimer", 6));
        animais.add(new Gato("Parker", 13));

        public static void onomatopeia(ArrayList <Animal> animais){
            System.out.println("--------------");
            for(int i = 0; i < animais.size(); i++){
                if(animais.get(i) instanceof Cachorro){
                    Cachorro dog = (Cachorro) animais.get(i);
                    System.out.println(("Peso: " + dog.getPeso()));
                }
                else 

            }
        }
    }
}

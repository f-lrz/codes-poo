package exerHerAni.Programa;
import exerHerAni.Entidades.*;

public class Aplicacao {
    public static void main(String[] args){
        Animal ani = new Animal("Aguia");
        Cachorro c1 = new Cachorro("Thor", 12);
        Gato g1 = new Gato("Binho", 2);

        ani.emiSom();
        c1.emiSom();
        g1.emiSom();
    }
}

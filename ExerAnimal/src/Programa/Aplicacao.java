package ExerAnimal.Programa;
import ExerAnimal.Entidades.*;

public class Aplicacao {
    public static void main(String[] args){
        
        Cachorro c1 = new Cachorro("Thor", 6, 12);
        Gato g1 = new Gato("Binho", 5, 2);

        c1.emiSom();
        g1.emiSom();
    }
}

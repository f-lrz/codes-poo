package exerList;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Programa {

	public static void main(String[] args) {
		LinkedList<String> carros = new LinkedList<String>();
		
		carros.add("Argo");
		carros.add("Polo");
		carros.add("Kwid");
		carros.add("Etios");
		carros.add("Kicks");
		System.out.println(carros);
		
		System.out.println(carros.size());
		System.out.println(carros.get(2));
		
		carros.add(1, "Gol");
		System.out.println(carros);
		
		carros.remove("Argo");
		System.out.println(carros);
		
		carros.remove(3);
		System.out.println(carros);
		
		int ind = carros.indexOf("Polo");
		System.out.println(ind);
		System.out.println();
		
		for(int i = 0; i < carros.size(); i++) System.out.println(carros.get(i));
		System.out.println();
		
		for(String c: carros) System.out.println(c);
		System.out.println();
		
		carros.forEach(car -> { System.out.println(car); });
		System.out.println();
		
		carros.clear();
		System.out.println(carros);
		
	}

}

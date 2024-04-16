package exerList;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		ArrayList<String> Carros = new ArrayList<String>();
		
		Carros.add("Argo");
		Carros.add("Polo");
		Carros.add("Kwid");
		Carros.add("Etios");
		
		System.out.println(Carros);
		System.out.println();
		System.out.println(Carros.size());
		System.out.println();
		System.out.println(Carros.get(2));
		

	}

}

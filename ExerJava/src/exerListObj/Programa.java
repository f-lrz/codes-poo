package exerListObj;
import java.util.ArrayList;
//import java.util.List;
//import java.util.LinkedList;

public class Programa {

	public static void main(String[] args) {
		ArrayList<Veiculo> carro = new ArrayList<Veiculo>();
		Veiculo v1 = new Veiculo("JDF4396", 2024, 400000);
		
		carro.add(v1);
		carro.add(new Veiculo("MPE2291", 2003, 12000));
		
		System.out.println(carro);
		
	}

}

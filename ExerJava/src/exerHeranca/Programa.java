package exerHeranca;

public class Programa {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo(130, 5);
		System.out.println("Velocidade: " + v1.getVeloc());
		System.out.println("Passageiros: " + v1.getPassag());
		System.out.println();
		
		Carro c1 = new Carro(50, 2, 4, 2023);
		System.out.println("Velocidade: " + c1.getVeloc());
		System.out.println("Passageiros: " + c1.getPassag());
		System.out.println("Portas: " + c1.getPortas());
		System.out.println("Passageiros: " + c1.getAno());
		System.out.println();
		
		Aviao a1 = new Aviao(950, 210, 300, "Boeing 767");
		System.out.println("Velocidade: " + a1.getVeloc());
		System.out.println("Passageiros: " + a1.getPassag());
		System.out.println("Portas: " + a1.getAssentos());
		System.out.println("Passageiros: " + a1.getModelo());
		System.out.println();

	}

}

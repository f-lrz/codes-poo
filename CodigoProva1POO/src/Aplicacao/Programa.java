package Aplicacao;

import Entidades.*;

public class Programa {

	public static void main(String[] args) {
		Contrato c1 = new Contrato(123, 2018, 111, 900000, "Joao", "Maria", 26, 27);
		Contrato c2 = new Contrato(456, 2022, 222, 1000000, "Jose", "Marta", 29, 24);
		Contrato c3 = new Contrato(789, 333, 1300000, "Pedro", "Rosane", 43, 41);
		
		c1.imprimeContrato();
		c2.imprimeContrato();
		c3.imprimeContrato();
	}

}

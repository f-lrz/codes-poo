package aplicacao;

import entidades.*;

public class Programa {

	public static void main(String[] args) {
		
		Material m[] = new Material[2];
		
		m[0] = new Livro(123, "livro", 2010);
		m[1] = new Tese(456, "tese", 2014);
		
		Emprestimo e1 = new Emprestimo(987, 11, m);
		
		e1.fazerDev(m, 23);
		
		e1.imprimeEmpre();

	}

}

package aplicacao;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;

import entidades.*;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		LocalDate d1 = LocalDate.of(2024, 2, 26);
		LocalDate d2 = LocalDate.of(2024, 3, 26);
		LocalDate d3 = LocalDate.of(2024, 5, 26);
		LocalDate d4 = LocalDate.of(2024, 4, 26);
		
			Ativo atv1 = new Ativo(1234, d1, "Cleison", "Jubson", 1234, true);
			Ativo atv2 = new Ativo(1224, d2, "Cleisan", "Jubron", 1237, false);
			Passivo pas1 = new Passivo(7224, d1, "Cleisin", "Juren", 324324, 2, "Falta de educação");
			Passivo pas2 = new Passivo(7824, d1, "Cleifein", "Jurun", 32535434, 1, "Falta de comprometimento");

	}

}

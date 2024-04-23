package exerDatas;

import java.text.ParseException;
import java.time.Period;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Datas {

	public static void main(String[] args) {
		tipoDate();
		tipoLocalDate();
		
	}
	
	public static void tipoDate() throws ParseException{
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println();
		
		d1 = formato.parse("27/04/2024");
		System.out.println(d1);
		System.out.println(formato.format(d1));
		System.out.println();
		System.out.println();
		
		Date d2 = new formato.parse("13/04/2024");
		System.out.println(formato.format(d2));
		System.out.println();
		
		long dif = d2.getTime() - d1.getTime();
		System.out.println(dif);
		dif = TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
		
		System.out.println(dif);
		
	}
	
	public static void tipoLocalDate() {
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		d1 = LocalDate.of(2024, 4, 10);
		
		LocalDate d2 = LocalDate.of(2024, 4, 20);
		
		long dif = ChronoUnit.DAYS.between(d1, d2);
		System.out.println(dif);
	}

}

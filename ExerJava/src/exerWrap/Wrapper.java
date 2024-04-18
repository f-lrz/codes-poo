package exerWrap;

public class Wrapper {
	public static void main(String[] args) {
	
		int i = 3; 
		Integer I = new Integer(i); 
		System.out.println("Valor de I é: " + I.doubleValue());
		I = Integer.valueOf(5); 
		System.out.println("Valor de I é: " + I.intValue());
		
		float f = 8f; 
		Float F = new Float(f); 
		System.out.println("O valor de F é: " + F.doubleValue());
		
		Character C = new Character('@'); 
		System.out.println("O valor de C é: " + C.charValue());
		
		Integer x = 4; 
		int y = x; 
		System.out.println("Valor de x é: " + x.intValue());
		System.out.println("Valor de x é: " + y);

	}

}

	




package basics;

public class Variablen {
	
	public static void main(String[] args) {
		
		// 8 Primitive Datentypen
		/*
		 * int
		 * long
		 * byte 
		 * short
		 * float
		 * double
		 * boolean
		 * char
		 */
		// <Datentyp> <Variablennamen> = <Wert> ;
		
		int zahl1 = 3;
		long zahl2 = 300;
		System.out.println(zahl1 + zahl2);
		
		double zahl3 = 322.23;
		float zahl4 = 23.34f;
		System.out.println(zahl3 + zahl4);
		
		boolean userClick = false;
		System.out.println(userClick);
		
		char zeichen = '!';
		System.out.println(zeichen);
		
		// Beispiele
		int zahl5 = 5;
		System.out.println(zahl5);
		
		int highscore = 0;
		System.out.println("Dein Highscore: " + highscore);
		highscore = 10;
		System.out.println("Dein Highscore: " + highscore);
		highscore = 20;
		System.out.println("Dein Highscore: " + highscore);
		
	}

}

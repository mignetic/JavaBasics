package basics;

public class Zeichenkette {
	
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
		
		char zeichen = '!';
		
		String zeichenkette = "Ich bin eine Zeichenkette";
		System.out.println(zeichenkette);
		
		String name = "Miguel";
		String alter = "45";
		
		System.out.println("Dein Name ist " + name + " und dein Alter ist " + alter + zeichen);
	}
}

package inputOutput;
import java.util.Scanner;

public class Einlesen {
	
	public static void main(String[] arg) {
		
		/* Klasse Scanner
		 * Klasse = Komplexer Datentyp sprich dort sind mehr als nur eine Information gespeichert
		 * Mit der Klasse Scanner hat man Methoden zur Verfügung, um Eigabe-Ströme (InputStream) einzulesen
		 * Scanner scanner = new Scanner(System.in); // System.in > Input = Tastatur
		 * 
		 * Was kann eingelesen werden?
		 * 
		 * nextInt() - Int
		 * nextFloat() - Float
		 * nextDouble() - Double
		 * nextLong() - Long
		 * nextShort() - Short
		 * next() - Einzelnes Wort
		 * nextLine() - String "Zeichenkette"
		 * nextBoolean - Boolean
		 */	
		
		Scanner scanner = new Scanner(System.in);
		// Beispiel
		String name = scanner.nextLine();
		char gender = scanner.next().charAt(0);
		int age = scanner.nextInt();
		long mobileNumber = scanner.nextLong();
		
		System.out.println("Name: " + name);
		System.out.println("Geschlecht: " + gender);
		System.out.println("Alter: " + age);
		System.out.println("Handynummer: " + mobileNumber);
				
		System.out.println("Bitte eine Zahl eitippen...");
		double zahl = scanner.nextDouble();
		System.out.println("Ihre Zahl lautet: " + zahl);
				
		System.out.println("Geben sie hier ihren Namen ein: ");
		String zeichenkette= scanner.next();
		System.out.println("Bitte geben sie hier ihr Alter ein: ");
		int alter = scanner.nextInt();
		System.out.println("Ihr name lautet: " + zeichenkette + " und ihr Alter ist: " + alter);
		
		scanner.close();
	}

}

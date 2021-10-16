package uebung;

import java.util.Scanner;

public class Verzweigung {
	
	public static void main(String[] args) {
		
		/* Kontrollstrukturen
		 * steuern den Programmablaufplan
		 * 
		 * if = falls
		 * else = ansonsten
		 * 
		 * maximal 4 Fälle mit if/else Anweisungen
		 */
		
		System.out.println("Wie viele Bundesländer hat Deutschland?");
		System.out.println("15, 3, 16 oder 30");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		
		if (userInput == 15) {
			System.out.println("Das ist falsch!");
		}else if (userInput == 3) {
			System.out.println("Das ist falsch!");
		}else if (userInput == 16) {
			System.out.println("Das ist richtig!");
		}else if (userInput == 30) {
			System.out.println("Das ist falsch!");
		}else {
			System.out.println("Bitte nur eine der vier geforderten Zahlen eingeben.");
		}
	}

}

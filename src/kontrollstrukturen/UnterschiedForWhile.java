package kontrollstrukturen;

import java.util.Scanner;

public class UnterschiedForWhile {
	
	public static void main(String[] args) {
		
		/* Unterschied zwischen For- und While-Schleife
		 * 
		 * for(Anfangswert; Abbruchbedingung; Z�hler) {
		 * 		Anweisungsblock
		 * }
		 * For-Schleife wird genutzt, wenn die Anzahl der Schleifendurchl�ufe bekannt ist
		 * 
		 * int count = 1;
		 * while(Bedingung) {
		 * 		Anweisungsblock
		 * }
		 * While-Schleife wird genutzt, wenn die Anzahl der Schleifendurchl�ufe unbekannt ist 
		 */
		
		for (int i = 1; i <=5; i++) {
			System.out.println("Asteroid wurde erstellt Nr: " + i);
		}
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Dr�cke 1 f�r Schwierigkeitsgrad Leicht \nDr�cke 2 f�r Schwierigkeitsgrad Mittel");
		
		int userInput = scan.nextInt();
		int anzahlGegner = 0;
		
		if (userInput == 1) {
			anzahlGegner = 10;
		}else if (userInput == 2) {
			anzahlGegner = 15;
		}
		
		while (anzahlGegner != 0) {
			System.out.println("Gegner Nr. " + anzahlGegner + " erstellt");
			anzahlGegner--;
		}
		
	}

}

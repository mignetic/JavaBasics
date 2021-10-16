package kontrollstrukturen;

public class SchleifeWhile {
	
	public static void main(String[] args) {
		
		/* Kontrollstrukturen steuern den Programmablaufplan
		 * 
		 * while = solange
		 * 
		 * Allgemeiner Aufbau einer while-Schleife
		 * 
		 * while(Bedingung) {
		 * 		Anweisungsblock
		 * } 
		 * 
		 * Merke: Bedingung kann entweder true = wahr oder false = nicht wahr sein
		 */
		
		int count = 1;
//		while (count != 6) { // Bedingung
//			System.out.println("Ich bin: " + count);
//			count++; // Zähler
//		}
		
		while (true) {
			System.out.println("Hi");
			if (count == 3) { // Bedingung
				break; // Abbruch
			}
			count++; // Zähler
		}
		
	}

}

package kontrollstrukturen;

import java.util.Scanner;

public class VerzweigungSwitch {

	public static void main(String[] args) {

		/*
		 * Kontrollstrukturen steuern den Programmablaufplan
		 * 
		 * switch = Fallunterscheidung case = der Fall
		 * 
		 * (Bedingung) als Bedingung gilt nur ein int, char und ein String
		 * 
		 * maximal 4 Fälle mit if/else Anweisungen
		 */

		switch (5) {
		case 0: {
			System.out.println("Die Zahl ist eine 0");
			break;
		}
		case 3: {
			System.out.println("Die Zahl ist eine 3");
			break;
		}
		case 5: {
			System.out.println("Die Zahl ist eine 5");
			break;
		}
		}

		System.out.println("Wie viele Bundesländer hat Deutschland?");
		System.out.println("15, 3, 16 oder 30");
		@SuppressWarnings("resource")
		
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();

		switch (userInput) {
		case 15:
			System.out.println("Das ist falsch!");
			break;
		case 3:
			System.out.println("Das ist falsch!");
			break;
		case 30:
			System.out.println("Das ist falsch!");
			break;
		case 16:
			System.out.println("Das ist richtig!");
			break;
		default:
			System.out.println("Zahl ist unbekannt!");
		}

	}
}

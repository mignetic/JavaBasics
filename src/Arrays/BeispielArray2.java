package Arrays;

import java.util.Scanner;

public class BeispielArray2 {

	public static void main(String[] args) {

		/*
		 * Array Deklaration Datentyp[] Name = new Datentyp[Anzahl];
		 * 
		 * Merke: Index = Anzahl der Elemente -1
		 * 
		 */

		String[] fragen = { "Wieviel ist 5 + 4", "Wieviel ist 3 * 5" };
		int[] antworten = { 9, 15 };

		int count = 0;
		while (count < fragen.length) {
			System.out.println(fragen[count]);

			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int eingabeUser = scan.nextInt();

			if (eingabeUser == antworten[count]) {
				System.out.println("Richtig");
				count++;
			} else {
				System.out.println("Falsch");
			}
		}
	}

}

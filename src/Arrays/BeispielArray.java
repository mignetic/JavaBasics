package Arrays;

import java.util.Scanner;

public class BeispielArray {
	
	public static void main(String[] args) {
		
		/*  
		 * Array Deklaration
		 * Datentyp[] Name = new Datentyp[Anzahl];
		 * 
		 * Merke: Index = Anzahl der Elemente -1
		 * index hier [6] ist 0...5
		 */
		
		int[] lottoZahlen = new int[6];
		for (int i = 0; i < lottoZahlen.length; i++) { // .length = Länge des Arrays
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int zahlUser = scan.nextInt();
			lottoZahlen[i] = zahlUser;
			
		}
		for (int i = 0; i < lottoZahlen.length; i++) {
			System.out.println(lottoZahlen[i]);
		}
		
		
		
	}

}

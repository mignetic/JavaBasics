package basics;

public class Operatoren2 {
	
	public static void main(String[] args) {
		
		/*
		 * Die Vergleich Operatoren werden oft im Zusammenhang
		 * mit if/else Konstruktionen verwendet
		 * 
		 * Beispiel:
		 * 
		 * if (Bedingung) {
		 * 
		 * Wenn die Bedingung true = also gleich wahr ist, dann wird alles zwischen
		 * { ausgeführt }
		 * 
		 * }
		 */
		
		// if = zu Deutsch falls
		// else = ansonsten
		
		int lebenGegner = 0;
		boolean hit = true;
		
		
		int a = 3;
		int b = 3;
		boolean c; // 1. true 2. false
		
		c = a == b;
		System.out.println(c);
		
		if (lebenGegner == 0 || hit == true) {
			System.out.println("Gegner zerstört");
		} else {
			System.out.println("Gegner hat noch: " + lebenGegner + " Punkte");
		}
		
	}

}

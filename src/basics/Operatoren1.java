package basics;

public class Operatoren1 {
	
	public static void main(String[] args) {
		
		// Was sind Operatoren
		/*
		 * Mit Operatoren kann man Variablen verändern oder allgemein mit ihnen arbeiten
		 *  
		 */
		
		int zahl = 5;
		
		int zahl1 = 10;
		int zahl2 = 5;
		
		int ergebnis;
		
		ergebnis = zahl1 + zahl2;
		System.out.println("Das Ergebnis lautet: " + ergebnis);
		
		ergebnis = zahl1 - zahl2;
		System.out.println("Das Ergebnis lautet: " + ergebnis);
		
		ergebnis = zahl1 * zahl2;
		System.out.println("Das Ergebnis lautet: " + ergebnis);
		
		ergebnis = zahl1 / zahl2;
		System.out.println("Das Ergebnis lautet: " + ergebnis);

		zahl++;
		System.out.println(zahl);
		
		zahl--;
		System.out.println(zahl);
		
		int lebenGegner = 100;
		int geschossEnergie = 20;
		
		lebenGegner = lebenGegner - geschossEnergie;
		System.out.println(lebenGegner);

		// Zuweisungsoperator
		lebenGegner -= geschossEnergie;
		System.out.println("Leben Gegner: " + lebenGegner);
	}

}

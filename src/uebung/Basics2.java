package uebung;

public class Basics2 {

	public static void main(String[] args) {
		
		/*
		 * Aufgabe:
		 * 1. Auto kostet: 3500
		 * 2. Auto kostet: 2340,48
		 * 
		 * 1. Daten in Variablen abspeichern
		 * 2. Kommazahl umwandeln zu einer Ganzzahl
		 * 3. Beide Ganzzahlen zu einem Gesamtbetrag verrechnen
		 * 4. Gesamtbetrag ausgeben mit Hilfe von System.out.prinln("");
		 */
		
		int auto1 = 3500;
		double auto2 = 2340.48;
		
		int gesamt = auto1 + (int)auto2;
		System.out.println("Der Gesamtbetrag lautet: " + gesamt + "?");
		
	}
	
}

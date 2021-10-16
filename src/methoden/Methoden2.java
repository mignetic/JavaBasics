package methoden;

public class Methoden2 {
	
	public static void main(String[] args) {
		
		/*
		 * <Modifikator Rückgabedatentyp Methodenname ( Datentyp Parameter1, Datentyp Parameter2 )>
		 * Ein Modifikator gibt den Sichtbereich der Methode an, es gibt public, private und protected
		 * 
		 * public = Modifikator
		 * void = leer, gibt nichts zurück
		 * return = rückgabe
		 * 
		 * Merke: Eine Methode erledigt eine bestimmte Aufgabe
		 */
		
//		for (int i = 1; i <= 10; i++) {
//			erstelleGegner();
//		}
		
		erstelleGegner("Miguel", 100);
		erstelleGegner("Peter", 80);
	}
	
//	public static void erstelleGegner() { // ohne Parameterliste
//		String gegnerName = "Olaf";
//		int gegnerLeben = 100;
//		System.out.println("Gegner " + gegnerName + " wurde erstellt und hat " + gegnerLeben + " Lebenspunkte.");
//	}
	
	public static void erstelleGegner(String name, int lebenspunkte) { // mit Parameterliste
		String gegnerName = name;
		int gegnerLeben = lebenspunkte;
		System.out.println("Gegner wurde erstellt: " + gegnerName + " LP: " + gegnerLeben);
	}

}

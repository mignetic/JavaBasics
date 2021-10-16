package methoden;

public class MethodenReturn {
	
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
		
		int summe = taschenrechner(5, 5, '+');
		System.out.println(summe);
		
	}
	
	public static int taschenrechner(int zahl1, int zahl2, char operator) {
		int summe; // lokale Variable
		if (operator == '+') {
			summe = zahl1 + zahl2;
		}else {
			summe = zahl1 - zahl2;
		}
		return summe;
		
	}

}
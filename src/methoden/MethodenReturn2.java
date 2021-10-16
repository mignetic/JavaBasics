package methoden;

public class MethodenReturn2 {
	
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
		
		int a = summe();
		System.out.println("Der Wert aus der Methode summe() ist: " + a);
		
		int summe = a - 5;
		System.out.println("Der Wert in summe ist: " + summe);
		
	}
	
	public static int summe() {
		int a, b, summe;
		a = 5;
		b = 5;
		
		summe = a + b;
		
		return summe;
	}

}

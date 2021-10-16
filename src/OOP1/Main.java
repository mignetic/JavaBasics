package OOP1;

public class Main {
	
	public static void main(String[] args) {
		
		/* Objekt erstellen
		 * Datentyp variablenNamen = new Konstruktor();
		 */
		
		Auto bmw = new Auto(); // ohne Konstruktor
		System.out.println(bmw);
		bmw.preis = 5000;
		bmw.marke = "BMW";		
		System.out.println(bmw.preis + "€ kostet der " + bmw.marke);
		
		Auto audi = new Auto(4, 5000, "Audi"); // mit Konstruktor		
		System.out.println(audi.preis + "€ kostet der " + audi.marke + " und hat " + audi.reifen + " Reifen");
	}

}

package OOP1;

public class Auto {
	
	int reifen;
	int preis;
	String marke;
	
	public Auto() { // Standard-Konstruktor, wird von Java erstellt, wenn nicht explizit erstellt
		
	}
	
	public Auto(int reifen, int preis, String marke) { // Konstruktor
		this.reifen = reifen;
		this.preis = preis;
		this.marke = marke;
	}

}

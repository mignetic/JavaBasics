package Arrays;

public class WasIstEinArray {
	
	public static void main(String[] args) {
		
		/*
		 * Variablen Deklaration
		 * Datentyp Name = Wert;
		 */
		 @SuppressWarnings("unused")
		int zahl = 50;
		 @SuppressWarnings("unused")
		double zahl1 = 34.34;
		 
		/*  
		 * Array Deklaration
		 * Datentyp[] Name = new Datentyp[Anzahl];
		 * 
		 */
		int[] zahlenArray = new int[7];
		zahlenArray[3] = 50;
		zahlenArray[5] = 500;
		zahlenArray[0] = 40;
		
		double[] zahlenArray1 = new double[7]; // Nur das Array erstellt
		zahlenArray1[1] = 34.23;
		zahlenArray1[4] = 50.45;
		
		String[] personA = {"Peter", "Müller", "35"};
		System.out.println("Name: " + personA[0] + " Nachname: " + personA[1] + " Alter: " + personA[2]);
	
	}

}

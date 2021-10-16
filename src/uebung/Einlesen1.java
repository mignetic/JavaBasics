package uebung;

import java.util.Scanner;

public class Einlesen1 {
	
	public static void main(String[] args) {
		
		/* Aufgabe
		 * 
		 * Erstelle erneut ein Objekt der Klasse Scanner
		 * und lese zwei Werte mithilfe dieser Klasse ein
		 * 
		 * 1. ist eine Ganzzahl, die Zahl soll dein Alter sein
		 * 2. ist eine Zeichenkette (String), dein Name
		 * 
		 * Am Ende soll dein Alter und dein Name in der Konsole ausgegeben werden
		 * System.out.println("Name: " +...+ " Alter: " +...);
		 */
		
		System.out.println("Bitte gib dein Alter ein.");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		scan.close();
		
		System.out.println("Bitte gib nun deinen Namen ein. ");
		Scanner scan1 = new Scanner(System.in);
		String name = scan1.next();
		scan1.close();
		
		System.out.println("Name: " + name + " Alter: " + age);
		
		
	}
}

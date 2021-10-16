package inputOutput;

public class Main {

	public static void main(String[] args) {
		
		Auto bmw = new Auto();
		bmw.price = 6000.50;
		bmw.tire = 4;
		
		System.out.println("Das Auto kostet " + bmw.price + "€ und hat " + bmw.tire + " Reifen");
		
	}
}

package kontrollstrukturen;

public class SchluesselwortIf {
	
	public static void main(String[] args) {
		
		/* Kontrollstrukturen
		 * steuern den Programmablaufplan
		 * 
		 * if = falls
		 * else = ansonsten
		 */
		
		int score = 4000;
		
		if(score == 5000) {
			System.out.println("Herzlichen Glückwunsch, neuer Rekord!");
		}else {
			System.out.println("Schade, dein Score reicht leider nicht!");
		}
		
		int lebenPlayer = 0;
		
		if(lebenPlayer == 0) { // false (nicht wahr)
			System.out.println("Game Over!");
		}
		
		boolean gegnerHit = false;
		int highscore = 0;
		
		if(gegnerHit == true) {
			System.out.println("Gegner getroffen");
			highscore += 10; //highscore = highscore + 10;
			System.out.println("Highscore " + highscore);
		}else {
			System.out.println("nicht getroffen!");
		}
		
	}

}


public class BlackJack {
	void start(){
			
		//String[] newDeck = new Cards().shuffle();
		
		System.out.println("Wil je Black Jack spelen?");
		new PlayerInput().responseStartGame();
		
		new Game().playGame();
	}
}
/* 'j' ja / 'n' nee
 * 'k' kaart vragen
 * 'p' passen op kaart
 * 'q' stop op elk moment van het spel
 */


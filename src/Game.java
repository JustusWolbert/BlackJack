import java.util.ArrayList;

public class Game {
	void playGame() {
		// shuffle deck
		String[] newDeck = new Cards().shuffle();
		int deckIndex = 0;
		
		ArrayList<String> playerHand = new ArrayList<String>();
		playerHand.add(newDeck[deckIndex]);
		deckIndex++;
		playerHand.add(newDeck[deckIndex]);
		deckIndex++;
		System.out.println("Je hebt de volgende kaarten: " + playerHand.get(0) + " en " + playerHand.get(1));
		
		int card1 = new Cards().value(playerHand.get(0));
		int card2 = new Cards().value(playerHand.get(1));
		int playerScore = card1 + card2;
		System.out.println("Totaal aantal punten: " + playerScore );
		//System.out.println(card2);

		ArrayList<String> dealerHand = new ArrayList<String>();
		dealerHand.add(newDeck[deckIndex]);
		deckIndex++;
		int dealerScore = new Cards().value(dealerHand.get(0));
		System.out.println("Dealer heeft " + dealerHand.get(0));
		
		while( playerScore < 21 && dealerScore < 21) {
			System.out.println("Wil je nog een kaart?");
			System.out.println("*geeft een kaart*");
			
			if(dealerScore < 17) {
				dealerHand.add(newDeck[deckIndex]);
				//int nCards = dealerHand.size();
				//System.out.println(nCards);
				dealerScore += new Cards().value(dealerHand.get(dealerHand.size()-1));
				deckIndex++;
				
				System.out.println("Dealer heeft " + dealerScore);
			}
			if(dealerScore > 21 || playerScore > 21) break;
			if(dealerScore > 16) break;
		}
		
	}

}
/* 'j' ja / 'n' nee
 * 'k' kaart vragen
 * 'p' passen op kaart
 * 'q' stop op elk moment van het spel
 */
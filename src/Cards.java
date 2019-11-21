import java.util.Random;

public class Cards {
	String[] deck = {"H2", "H3", "H4", "H5", "H6", "H7",  "H8", "H9", "H10", "HB", "HV", "HH", "HA",
			"K2", "K3", "K4", "K5", "K6", "K7",  "K8", "K9", "K10", "KB", "KV", "KH", "KA",
			"S2", "S3", "S4", "S5", "S6", "S7",  "S8", "S9", "S10", "SB", "SV", "SH", "SA",
			"R2", "R3", "R4", "R5", "R6", "R7",  "R8", "R9", "R10", "RB", "RV", "RH", "RA"
			};
			// (H)arten, (K)laveren, (S)choppen), (R)uiten
	
	String[] shuffle(){
		String[] shuffledDeck = deck;
		Random rand = new Random();
		
		for (int i = 0; i < shuffledDeck.length; i++){
			int randomIndexToSwap = rand.nextInt(shuffledDeck.length);
			String temp = shuffledDeck[randomIndexToSwap];
			shuffledDeck[randomIndexToSwap] = shuffledDeck[i];
			shuffledDeck[i] = temp;
		}
		return shuffledDeck;
	}
	
	int value(String cardSymbol) {
		int cardValue = 0;
		switch(cardSymbol.charAt(1)) {
			case '2': cardValue = 2;
				break;
			case '3': cardValue = 3;
				break;
			case '4': cardValue = 4;
				break;
			case '5': cardValue = 5;
				break;
			case '6': cardValue = 6;
				break;
			case '7': cardValue = 7;
				break;
			case '8': cardValue = 8;
				break;
			case '9': cardValue = 9;
				break;
			case '1': cardValue = 10;
				break;
			case 'B': case 'V': case 'H': 
				cardValue = 10;
				break;
			case 'A': cardValue = 11;
				break;
		}
		
		System.out.println("Dit is de waarde van de kaart: " + cardValue);
		return cardValue;
	}
}

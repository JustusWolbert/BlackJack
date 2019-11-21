import java.util.Scanner;

public class PlayerInput {
	void responseStartGame() {
		
		Scanner sc = new Scanner(System.in);
		int legitAnswer = 1;
		
		do {
			
			String inputString;
			switch (sc.next()) {
			case "j": inputString = "j"; //System.out.println("Hoi j");
				break;
			case "n": inputString = "n";
				break;
			case "q": inputString = "q";
				break;
			default: inputString = "Geen geldige optie. Kies 'j', 'n' of 'q'."; legitAnswer = 0;
				break;
			}
			
			System.out.println(inputString);
		} while(legitAnswer < 1);
		sc.close();
		/*
		while(legitAnswer < 1) {
			String inputString;
			switch (new InputScanner().in()) {
			case "j": inputString = "j"; //System.out.println("Hoi j");
				break;
			case "n": inputString = "n";
				break;
			case "q": inputString = "q"; legitAnswer = 1;
				break;
			default: inputString = "Geen geldige optie. Kies 'j', 'n' of 'q'.";
				break;
			}
			System.out.println(inputString);
		}
		*/
		/*
		String inputString;
		switch (new InputScanner().in()) {
		case "j": inputString = "j"; //System.out.println("Hoi j");
			break;
		case "n": inputString = "n";
			break;
		case "q": inputString = "q";
			break;
		default: inputString = null; System.out.println("Geen geldige optie. Kies 'j', 'n' of 'q'.");
		new PlayerInput().responseStartGame();
			break;
		}
		System.out.println(inputString);
		*/
	}
	void responseInGame() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String inputString;
		
		switch (a) {
			case "k": inputString = a;
				break;
			case "p": inputString = a;
				break;
			case "q": inputString = a;
				break;
			default: inputString = "Geen geldige optie. Kies 'k', 'p' of 'q'.";
				break;
		} 
		sc.close();
		System.out.println(inputString);
		
		
	}
}
/* 'j' ja / 'n' nee
 * 'k' kaart vragen
 * 'p' passen op kaart
 * 'q' stop op elk moment van het spel
 */

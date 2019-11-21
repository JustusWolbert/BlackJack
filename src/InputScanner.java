import java.util.Scanner;

public class InputScanner {
	String in() {
		Scanner sc = new Scanner(System.in); // probeer scanner buiten de while loop te zetten of andere input methode
		String a = sc.next(); // scanner is soms te sloom in combinatie met while loop
		sc.close();
		return a;
	}
}

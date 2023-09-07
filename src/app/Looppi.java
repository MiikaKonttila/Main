package app;
import java.util.Scanner;
public class Looppi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);	
		String correctAnswer = "Emma";
		int numberOfGuesses = 0;
		String userGuess;
		
        System.out.println("Guess my name (type stop to exit)");
        do {
        	userGuess = in.nextLine();
        	numberOfGuesses++;
        	
        	if (userGuess.equalsIgnoreCase(correctAnswer)) {
        		System.out.println("Congratulations!");
        		break;
        	}else if (userGuess.equalsIgnoreCase("stop")) {
        		numberOfGuesses--;
        		break;       		
        	}else {
        		System.out.println("Guess my name (type stop to exit)");        		
        	}
        }while (true);
        System.out.println("You guessed " + numberOfGuesses + " times.");
        in.close();
	}
}


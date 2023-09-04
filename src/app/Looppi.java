package app;
import java.util.Scanner;
public class Looppi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);	
		String correctAnswer = "Emma";
		int numberOfGuesses = 0;
		String userGuess;
		
        System.out.println("Guess my name(type stop to exit)");
        do {
        	userGuess = in.nextLine();
        	numberOfGuesses++;
        	
        	if (userGuess.equalsIgnoreCase(correctAnswer)) {
        		System.out.println("Congratulation!");
        		break;
        	}else if (userGuess.equalsIgnoreCase("stop")) {
        		System.out.println("Game over. You stopped guessing.");
        		numberOfGuesses--;
        		break;       		
        	}else {
        		System.out.println("Incorrect guess. Try again");        		
        	}
        }while (true);
        System.out.println("You guessed " + numberOfGuesses + " times.");
        in.close();
	}
}


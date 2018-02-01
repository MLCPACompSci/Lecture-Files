import java.util.Random;
import java.util.Scanner;

public class RPS3017 {
	public static Scanner input = new Scanner(System.in);
	public static Random rando = new Random();
	public static int win;
	public static int loss;

	public static void RPSmatch() {
		int userChoice;
		int compChoice;

		// Get input & get random number
		System.out.println("0 for Rock, 1 for Paper, 2 for Scissors.");
		System.out.print("What is your choice? ");
		userChoice = input.nextInt();
		compChoice = rando.nextInt(3);

		if (userChoice == compChoice) {
			System.out.println("It's a tie!");
		} else if (compChoice - userChoice == 1 || compChoice - userChoice == -2) {
			System.out.println("You lose!");
			loss++;
			System.out.println("Wins: " + win);
			System.out.println("Loss: " + loss);
		} else {
			System.out.println("You win!");
			win++;
			System.out.println("Wins: " + win);
			System.out.println("Loss: " + loss);
		}

	}

	public static void main(String[] args) {
		win = 0;
		loss = 0;
		
		while (win < 3 && loss < 3) {
			RPSmatch();
		}
		input.close();
	}
}

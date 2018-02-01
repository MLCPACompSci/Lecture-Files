import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		// Rock, Paper Scissors
		int win = 0;
		int loss = 0;
		int userChoice;
		int compChoice;
		
		Random rando = new Random();
		Scanner input = new Scanner(System.in);
		while(win < 2 || loss < 2) {
		System.out.print("What is your choice? 0 for rock, 1 for paper, or 2 for scissors");
		userChoice = input.nextInt();
		compChoice = rando.nextInt(3);
		
		if (userChoice == compChoice) {
			System.out.println("It's a tie!");
		}
		else if(userChoice == 0) {
				if(compChoice == 1) {
					loss++;
					System.out.println("Paper! you lose!");
				}
				else {
					win++;
					System.out.println("Scissors! You win!");
				}
			}
		else if(userChoice == 1) {
			if(compChoice == 0) {
				win++;
				System.out.println("Rock! You win!");
			}
			else {
				loss++;
				System.out.println("Scissors! you lose!");
			}
		}
		else if(userChoice == 2) {
			if(compChoice == 0) {
				loss++;
				System.out.println("Rock! you lose!");
			}
			else {
				win++;
				System.out.println("Paper! You win!");
			}
		}
		
		}
		input.close();

	}

}

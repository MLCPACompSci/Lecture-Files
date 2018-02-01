import java.util.*;
public class RPS {

	public static void main(String[] args) {
		//Declare variables
		int win = 0;
		int loss = 0;
		int userChoice;
		int compChoice;
		
		//Create new Scanner & Random objects
		Scanner input = new Scanner(System.in);
		Random rando = new Random();
		
		//Get input & get random number
		System.out.println("0 for Rock, 1 for Paper, 2 for Scissors.");
		System.out.print("What is your choice? ");
		userChoice = input.nextInt();
		compChoice = rando.nextInt(3);
		
		if(userChoice == compChoice) {
			System.out.println("It's a tie!");
		}
		else {
			//Fill in game logic here
			
		}
		// TODO: create while loop that repeats game best out of 3
		input.close();
	}

}

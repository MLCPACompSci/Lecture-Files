import java.util.*;

public class Pig {
	static int P1Score;
	static int P2Score;
	static Scanner input = new Scanner(System.in);
	static Random rando = new Random();
	static int diceRoll;

	public static int playerTurn(int savedScore, String player) {
		String keepRolling = "Y";
		int tempScore = 0;
		while (keepRolling.equals("Y") || keepRolling.equals("y")) {
			System.out.println(player + ", your current score is " + (tempScore + savedScore));
			diceRoll = rando.nextInt(6) + 1;
			if (diceRoll == 1) {
				tempScore = 0;
				keepRolling = "N";
				System.out.println("Ah, nuts, you rolled a 1. End of turn!");
			} else if (savedScore + tempScore < 100) {
				tempScore += diceRoll;
				System.out.println(player + " rolled a " + diceRoll + "!");
				System.out.println("Do you want to keep rolling? Y or N?");
				keepRolling = input.nextLine();
			} else {
				System.out.println("You hit 100! You win!");
				keepRolling = "N";
			}
		}
		savedScore += tempScore;
		System.out.println(player + ", your score is " + savedScore);

		if (savedScore < 100) {
			System.out.println("Next turn!");
		} else {
			System.out.println(player + " wins!");
			System.out.println("Player 1: " + P1Score);
			System.out.println("Player 2: " + P2Score);
		}
		return savedScore;
	}

	public static void main(String[] args) {
		P1Score = 0;
		P2Score = 0;
		while (P1Score < 100 && P2Score < 100) {
			P1Score = playerTurn(P1Score, "Player 1");
			if (P1Score >= 100) {
				break;
			}

			P2Score = playerTurn(P2Score, "Player 2");
		}
	}
}

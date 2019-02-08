package game;

import java.util.ArrayList;
import java.util.Scanner;

public class Scores {

	public int scoreRemaining(Player player) {
		boolean inputInvalid = true;
		Scanner s = new Scanner(System.in);
		while (inputInvalid) {
			System.out.println(player.getName() + " what did you get?");
			int input = s.nextInt();
			if (input >= 0 && input <= 180) {
				player.setScore(player.getScore() - input);
				if (player.getScore() < 0) {
					System.out.println("Bust.");
					player.setScore(player.getScore() + input);
				}
				inputInvalid = false;
			} else {
				System.out.println("Invalid score. Please enter a valid score.");
			}
		}

		return player.getScore();
	}

	public String scoreReadout(ArrayList<Player> players) {
		String str = "";
		for (Player player : players) {
			str += player.getName() + " Score: " + player.getScore() + " ";
		}

		return str;
	}

	public String checkoutReader(ArrayList<Player> players) {
		Checkout co = new Checkout();
		String str = "";
		for (Player player : players) {
			str += co.checkoutCalculator(player.getScore()) + " ";
		}

		return str;
	}
}
package game;

import java.util.ArrayList;

public class Game {

	ArrayList<Player> players = new ArrayList<Player>();

	public void play(ArrayList<Player> players, int scoreStart) {
		boolean notWon = true;
		Scores score = new Scores();
		for (Player player : players) {
			player.setScore(scoreStart);
		}
		System.out.println(score.scoreReadout(players));
		
		while (notWon) {
			for (Player player : players) {
				score.scoreRemaining(player);
				if (player.getScore() == 0) {
					System.out.println("Leg complete. " + player.getName() + " has won.");
					notWon = false;
					break;
				}
				System.out.println(score.scoreReadout(players));
				System.out.println(score.checkoutReader(players));
			}
		}

	}

	public void addPlayer(Player player) {
		if (players.contains(player)) {
			System.out.println(player.getName() + " is already playing this game.");
		} else {
			players.add(player);
		}
	}

}

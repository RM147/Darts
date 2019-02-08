package game;
import java.util.concurrent.ThreadLocalRandom;
public class DrawHands {

	public static void main(String[] args) {
		drawHand(5);
		
	}
	public static String drawHand(int handSize) {
		String hand = "Your hand is: ";
		String card = "";
		for (int i=0; i<handSize;i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(1, 4);
			if(randomNum == 1) {
				card = "Rock";
			}else if(randomNum == 2) {
				card = "Paper";
			}else if(randomNum == 3) {
				card = "Scissors";
			}
			hand += card + ", ";
		}
		System.out.println(hand);
		return hand;
	}

}

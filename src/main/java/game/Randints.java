package game;
import java.util.concurrent.ThreadLocalRandom;

public class Randints {

	public static void main(String[] args) {
		int zeroes = 0;
		int ones = 0;
		int twos = 0;
		for (int i = 0; i < 100; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(0, 3);

			if (randomNum == 0) {
				zeroes++;
			} else if (randomNum == 1) {
				ones++;
			} else if (randomNum == 2) {
				twos++;
			}
		}
		System.out.println("Number of 0s: " + zeroes);
		System.out.println("Number of 1s: " + ones);
		System.out.println("Number of 2s: " + twos);

	}

}

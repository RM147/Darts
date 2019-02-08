package game;

public class Checkout {

	public static void main(String[] args) {
		for (int i = 175; i > 0; i--) {
			//System.out.println(i + " " + checkoutCalculator(i));
		}

	}

	public String checkoutCalculator(int score) {
		String readout = "";
		boolean advance = true;
		if (score > 170 || score > 160 && score < 170 || score == 159) {
			readout += "No outshot";
			advance = false;
		}
		while (advance) {
			if (score > 60) {
				if (score % 2 == 0) {
					score -= 60;
					readout += "T20, ";
				} else {
					score -= 57;
					readout += "T19, ";
				}
			} else {
				advance = false;
			}
		}
		if (score == 50) {
			readout += "Bull";
		}
		if (40 < score && score <= 60 && score != 50) {
			if (score % 2 == 0) {
				score -= 20;
				readout += "20, ";
			} else {
				score -= 19;
				readout += "19, ";
			}
		}
		if (score <= 40) {
			if (score % 2 == 0) {
				int lastDart = score / 2;
				readout += "D" + lastDart;

			} else {
				int lastDart = score / 2;
				readout += "1, D" + lastDart;

			}

		}
		return readout;

	}
}

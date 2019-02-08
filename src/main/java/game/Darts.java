package game;

public class Darts {

	public static void main(String[] args) {
		Player john = new Player("John");
		Player adam = new Player("Adam");
		Player steve = new Player("Steve");
		Game a = new Game();
		a.addPlayer(john);
		a.addPlayer(adam);
		a.addPlayer(steve);
		a.addPlayer(adam);
		a.play(a.players, 500);
		// a.play(john, 500);

	}
}

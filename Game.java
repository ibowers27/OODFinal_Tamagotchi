public class Game {
	// Static instance of Singleton class
	private static Game instance = null;

	// Private constructor
	private Game() {
		System.out.println("Game instance created.");
	}

	public static Game getInstance() {
		if (instance == null) {
			synchronized (Game.class) {
				if (instance == null) {
					instance = new Game();
				}
			}
		}
		return instance;
	}

	public static start() {
		System.out.println("Welcome to Tamagotchi!");
		System.out.println("Enter a name for your pet friend: ");

		
	}
}
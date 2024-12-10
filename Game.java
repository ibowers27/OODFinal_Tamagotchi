/* Daniel Messiana
 * This class represents the main game loop/structure.
 *
 * There can only be one instance of the Game class
 *
 * The user will begin by creating a unique Tamagotchi pet, 
 * which will be stored in the playerPet variable. 
 * It is ensured there will only be one Tamagotchi per game instance.
*/

public class Game {
	// Static instance of Singleton class
	private static Game instance = null;
	private static Tamagotchi playerPet = null;

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

	public static void setTamagotchi(Tamagotchi pet) {
		if (playerPet == null) {
			synchronized (Tamagotchi.class) {
				if (instance == null) {
					playerPet = pet;	
				}
			}
		}
	}

	public static Tamagotchi getTamagotchi() {
		return playerPet;
	}

}
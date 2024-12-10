/** Ivy Bowers
 * This is the Tamagotchi class that handles the features of the Tamagotchi. These features can be customized through the
 * UI using the builder method.
 */
public class Tamagotchi {
	// Customizable variables (builder)
	private String name;
	private String color;
	private String uniqueTrait;
	private String accessory;
	private String personality;

	// Getters
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getUniqueTrait() {
		return uniqueTrait;
	}

	public String getAccessory() {
		return accessory;
	}

	public String getPersonality() {
		return personality;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setUniqueTrait(String uniqueTrait) {
		this.uniqueTrait = uniqueTrait;
	}

	public void setAccessory(String accessory) {
		this.accessory = accessory;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	public String toString() {
		return "Tamagotchi: " +
				"\nName: " + name +
				"\nColor: " + color +
				"\nUnique Trait: " + uniqueTrait +
				"\nAccessory: " + accessory +
				"\nPersonality: " + personality;
	}

}
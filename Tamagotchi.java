public class Tamagotchi {
	private String name;
	private String color;
	private String uniqueTrait;
	private String accessory;
	private String personality;

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

	public String toString(){
		return "Tamagotchi: " +
				"\nName: " + name +
				"\nColor: " + color +
				"\nUnique Trait: " + uniqueTrait +
				"\nAccessory: " + accessory +
				"\nPersonality: " + personality;
	}
}
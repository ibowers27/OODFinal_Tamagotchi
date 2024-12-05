public class Tamagotchi {
	private String name;
	private String color;
	private String uniqueTrait;
	private String accessory;
	private String personality;

	void setName(String name) {
		this.name = name;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setUniqueTrait(String uniqueTrait) {
		this.uniqueTrait = uniqueTrait;
	}

	void setAccessory(String accessory) {
		this.accessory = accessory;
	}

	void setPersonality(String personality) {
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
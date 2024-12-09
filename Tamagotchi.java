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

	private int health = 50;
	private int hunger = 50;
	private int cleanliness = 50;
	private int happiness = 50;
	// each modifyN class takes a value as a parameter then uses Math.max to ensure
	// the value isn't under 0, then Math.min to ensure the value isn't over 100,
	// then notifies the observers.
	public void modifyHealth(int changeInValue) {
		health = Math.max(0, Math.min(100, health + changeInValue));
		// notifyObservers();
	}
	public void modifyHunger(int changeInValue) {
		hunger = Math.max(0, Math.min(100, hunger + changeInValue));
		// notifyObservers();
	}
	public void modifyCleanliness(int changeInValue) {
		cleanliness = Math.max(0, Math.min(100, cleanliness + changeInValue));
		// notifyObservers();
	}
	public void modifyHappiness(int changeInValue) {
		happiness = Math.max(0, Math.min(100, happiness + changeInValue));
		// notifyObservers();
	}
}
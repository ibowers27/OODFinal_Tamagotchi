public class TamagotchiBuilder {
	private Tamagotchi tamagotchi;

    // constructor for connecting the builder with the tamagotchi
    public TamagotchiBuilder(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    // building methods
    public void buildName(String name) {
        tamagotchi.setName(name);
    }

    public void buildColor(String color) {
        tamagotchi.setColor(color);
    }

    public void buildUniqueTrait(String uniqueTrait) {
        tamagotchi.setUniqueTrait(uniqueTrait);
    }

    public void buildAccessory(String accessory) {
        tamagotchi.setAccessory(accessory);
    }

    public void buildPersonality(String personality) {
        tamagotchi.setPersonality(personality);
    }

    public Tamagotchi getTamagotchi() {
        return this.tamagotchi;
    }

}

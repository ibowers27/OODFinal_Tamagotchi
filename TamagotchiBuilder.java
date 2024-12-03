public class TamagotchiBuilder {
	private Tamagotchi tamagotchi;

    // constructor for connecting the builder with the tamagotchi
    public TamagotchiBuilder(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }

    // building methods
    public void buildColor(Color color) {
        tamagotchi.setColor(color);
    }

    public void buildFeature(Feature feature) {
        tamagotchi.setFeature(feature);
    }

    public void buildAccessory(Accessory accessory) {
        tamagotchi.setAccessory(accessory);
    }

    public void buildPersonality(Personality personality) {
        tamagotchi.setPersonality(personality);
    }

    // get the wedding package that was just built
    public Tamagotchi getTamagotchi() {
        return this.tamagotchi;
    }

}

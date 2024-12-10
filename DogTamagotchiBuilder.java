/** Ivy Bowers
 *  This is a concrete builder implementing the TamagotchiBuilder interface.
 */
public class DogTamagotchiBuilder implements TamagotchiBuilder {
    private Tamagotchi tamagotchi;

    // Constructor for connecting the builder with the tamagotchi
    public DogTamagotchiBuilder() {
        this.tamagotchi = new Tamagotchi();
    }

    // Building methods
    @Override
    public void buildName(String name) {
        tamagotchi.setName(name);
    }

    @Override
    public void buildColor(String color) {
        tamagotchi.setColor(color);
    }

    @Override
    public void buildUniqueTrait(String uniqueTrait) {
        tamagotchi.setUniqueTrait(uniqueTrait);
    }

    @Override
    public void buildAccessory(String accessory) {
        tamagotchi.setAccessory(accessory);
    }

    @Override
    public void buildPersonality(String personality) {
        tamagotchi.setPersonality(personality);
    }

    @Override
    public Tamagotchi getTamagotchi() {
        return this.tamagotchi;
    }

}

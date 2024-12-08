public class CatTamagotchiBuilder implements TamagotchiBuilder {
    private Tamagotchi tamagotchi;

    // constructor for connecting the builder with the tamagotchi
    public CatTamagotchiBuilder() {
        this.tamagotchi = new Tamagotchi();
    }

    // building methods
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

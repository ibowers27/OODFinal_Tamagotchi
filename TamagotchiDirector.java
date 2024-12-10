/** Ivy Bowers
 * This is the director for the builder. This is used to simplify Tamagotchi creation and customization.
 */
public class TamagotchiDirector {
    // Reference the builder
    private TamagotchiBuilder builder;

    // Director constructor
    public TamagotchiDirector(TamagotchiBuilder builder) {
        this.builder = builder;
    }

    // Construct method compiling all build methods and returning the built tamagotchi
    public Tamagotchi constructTamagotchi(String name, String color, String uniqueTrait, String accessory, String personality) {
        builder.buildName(name);
        builder.buildColor(color);
        builder.buildUniqueTrait(uniqueTrait);
        builder.buildAccessory(accessory);
        builder.buildPersonality(personality);
        return builder.getTamagotchi();
    }
}

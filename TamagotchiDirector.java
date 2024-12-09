/** Ivy Bowers
 * This is the director for the builder.
 */
public class TamagotchiDirector {
    private TamagotchiBuilder builder;

    public TamagotchiDirector(TamagotchiBuilder builder) {
        this.builder = builder;
    }

    public Tamagotchi constructTamagotchi(String name, String color, String uniqueTrait, String accessory, String personality) {
        builder.buildName(name);
        builder.buildColor(color);
        builder.buildUniqueTrait(uniqueTrait);
        builder.buildAccessory(accessory);
        builder.buildPersonality(personality);
        return builder.getTamagotchi();
    }
}

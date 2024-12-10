/** Ivy Bowers
 * This is the builder interface. It allows for the customization of the user's tamagotchi and ensures extensibility for
 * adding more types of tamagotchis that can be customized. We use this pattern because we can produce different types
 * and representations of an object (Tamagotchis) using the same builder code and methods.
 */
public interface TamagotchiBuilder {
    void buildName(String name);
	void buildColor(String Color);
    void buildUniqueTrait(String uniqueTrait);
    void buildAccessory(String accessory);
    void buildPersonality(String personality);
    Tamagotchi getTamagotchi();
}

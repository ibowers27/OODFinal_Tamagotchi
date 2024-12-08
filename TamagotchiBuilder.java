// builder interface
public interface TamagotchiBuilder {
    void buildName(String name);
	void buildColor(String Color);
    void buildUniqueTrait(String uniqueTrait);
    void buildAccessory(String accessory);
    void buildPersonality(String personality);
    Tamagotchi getTamagotchi();
}

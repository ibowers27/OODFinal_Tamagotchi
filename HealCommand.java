// Angelo
// Command pattern subclass handling the healing function for the tamagotchi, and modifying corresponding stats
public class HealCommand implements Command {
    @Override
    public void execute(TamagotchiStats tamagotchiStats) {
        tamagotchiStats.increaseHealth(20);
        tamagotchiStats.increaseHappiness(5);
    }
}

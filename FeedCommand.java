// Angelo
// Command pattern subclass handling the feeding function for the tamagotchi, and modifying corresponding stats
public class FeedCommand implements Command {
    @Override
    public void execute(TamagotchiStats tamagotchiStats) {
        tamagotchiStats.increaseHunger(20);
        tamagotchiStats.increaseHealth(10);
        tamagotchiStats.increaseHappiness(5);
    }
}

// Angelo
// Command pattern subclass handling the feeding function for the tamagotchi, and modifying corresponding stats
public class FeedCommand implements Command {
    @Override
    public void execute(TamagotchiStats tamagotchiStats) {
        tamagotchiStats.modifyHunger(20);
        tamagotchiStats.modifyHealth(10);
        tamagotchiStats.modifyHappiness(5);
    }
}

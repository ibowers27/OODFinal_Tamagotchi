public class FeedCommand implements Command {
    @Override
    public void execute(TamagotchiStats tamagotchiStats) {
        tamagotchiStats.modifyHunger(20);
        tamagotchiStats.modifyHealth(10);
        tamagotchiStats.modifyHappiness(5);
    }
}

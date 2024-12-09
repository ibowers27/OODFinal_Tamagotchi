public class PlayCommand implements Command {
    @Override
    public void execute(TamagotchiStats tamagotchiStats) {
        tamagotchiStats.modifyEntertainment(20);
        tamagotchiStats.modifyHappiness(15);
    }
}

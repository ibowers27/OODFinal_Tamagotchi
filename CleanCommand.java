public class CleanCommand implements Command{
    @Override
    public void execute(TamagotchiStats tamagotchiStats) {
        tamagotchiStats.modifyCleanliness(20);
        tamagotchiStats.modifyHappiness(10);
    }
}

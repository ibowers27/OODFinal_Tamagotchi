// Angelo
// Command pattern subclass handling the cleaning function for the tamagotchi, and modifying corresponding stats
public class CleanCommand implements Command{
    @Override
    public void execute(TamagotchiStats tamagotchiStats) {
        tamagotchiStats.modifyCleanliness(20);
        tamagotchiStats.modifyHappiness(10);
    }
}

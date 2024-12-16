import java.util.Random;
// Angelo and Daniel
// Command pattern subclass handling the cleaning function for the tamagotchi, and modifying corresponding stats
public class CleanCommand implements Command{
    private Random random = new Random();
    
    @Override
    public void execute(TamagotchiStats tamagotchiStats) {
        tamagotchiStats.increaseCleanliness(20);
        tamagotchiStats.increaseHappiness(10);
        // 20% chance to get hungry while cleaning
        if (random.nextInt(101) < 20) {
            tamagotchiStats.decreaseHunger(8);
        }
    }
}

import java.util.Random;
// Angelo and Daniel
// Command pattern subclass handling the playing function for the tamagotchi, and modifying corresponding stats
public class PlayCommand implements Command {
    @Override
    public void execute(TamagotchiStats tamagotchiStats) {
        tamagotchiStats.increaseEntertainment(20);
        tamagotchiStats.increaseHappiness(15);
        // 30% chance to get injured while playing
        if (random.nextInt(101) < 30) {
            tamagotchiStats.decreaseHealth(15);
        }
    }
}

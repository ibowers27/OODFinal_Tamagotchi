// Angelo
// Command pattern subclass handling the playing function for the tamagotchi, and modifying corresponding stats
public class PlayCommand implements Command {
    @Override
    public void execute(TamagotchiStats tamagotchiStats) {
        tamagotchiStats.modifyEntertainment(20);
        tamagotchiStats.modifyHappiness(15);
    }
}

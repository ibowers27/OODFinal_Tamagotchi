public class FeedCommand implements Command {
    @Override
    public void execute(Tamagotchi tamagotchi) {
        tamagotchi.modifyHunger(20);
        tamagotchi.modifyHealth(10);
        tamagotchi.modifyHappiness(5);
    }
}

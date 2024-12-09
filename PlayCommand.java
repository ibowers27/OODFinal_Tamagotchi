public class PlayCommand implements Command {
    @Override
    public void execute(Tamagotchi tamagotchi) {
        tamagotchi.modifyHappiness(20);
    }
}

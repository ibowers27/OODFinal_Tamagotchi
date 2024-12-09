public class HealCommand implements Command {
    @Override
    public void execute(Tamagotchi tamagotchi) {
        tamagotchi.modifyHealth(20);
        tamagotchi.modifyHappiness(5);
    }
}

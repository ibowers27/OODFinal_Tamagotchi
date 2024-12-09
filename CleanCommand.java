public class CleanCommand implements Command{
    @Override
    public void execute(Tamagotchi tamagotchi) {
        tamagotchi.modifyCleanliness(20);
        tamagotchi.modifyHappiness(10);
    }
}

/** Angelo Morelli, Ivy Bowers
 * Command interface allows for extensibility; you can add more commands easily.
 * We decided to make an object specifically for the Tamagatchi's statistics that will be handled
 * by the commands and observer/publisher.
 */
public interface Command {
    void execute(TamagotchiStats tamagotchiStats);
}

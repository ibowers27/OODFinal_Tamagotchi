/** Daniel Messiana, Ivy Bowers
 * Observer interface
 * Concrete observers share the common observer interface
 * with the update method. Allows for easy creation of more observers.
 */
public interface Observer {
    void update(int health, int hunger, int cleanliness, int entertainment, int happiness);
}

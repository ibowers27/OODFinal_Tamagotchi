/** Daniel Messiana, Ivy Bowers
 * Observer interface
 * Concrete observers share the common observer interface
 * with the update method.
 */
public interface Observer {
    void update(int health, int hunger, int cleanliness, int entertainment, int happiness);
}

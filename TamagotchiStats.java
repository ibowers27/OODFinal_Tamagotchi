import java.util.ArrayList;
import java.util.List;

/** Angelo Morelli, Daniel Messiana, Ivy Bowers
 * Tamagatchi class created to manage the tamagatchi's stats like health, hunger, cleanliness, entertainment, and happiness.
 * This also acts as the Subject (Observable) for the observer and holds functions for the commands that are affecting the
 * statistics.
 */
public class TamagotchiStats {
    private List<Observer> observers;  // List of observers

    // Internal state values (command & observer)
    private int health;
    private int hunger;
    private int cleanliness;
    private int entertainment;
    private int happiness;

    public TamagotchiStats() {
        this.observers = new ArrayList<>();

        // Set default/initial values for stats
        this.health = 50;
        this.hunger = 50;
        this.cleanliness = 50;
        this.entertainment = 50;
        this.happiness = 50;
    }

    // Method to add an observer
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to remove an observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers of a change in a statistic
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(health, hunger, cleanliness, entertainment, happiness);  // Pass the updated happiness
        }
    }

    // Angelo - part of command class implementation alongside Observer
    // each modifyN class takes a value as a parameter then uses Math.max to ensure
    // the value isn't under 0, then Math.min to ensure the value isn't over 100,
    // then notifies the observers.
    public void modifyHealth(int changeInValue) {
        health = Math.max(0, Math.min(100, health + changeInValue));
        notifyObservers();
    }
    public void modifyHunger(int changeInValue) {
        hunger = Math.max(0, Math.min(100, hunger + changeInValue));
        notifyObservers();
    }
    public void modifyCleanliness(int changeInValue) {
        cleanliness = Math.max(0, Math.min(100, cleanliness + changeInValue));
        notifyObservers();
    }
    public void modifyEntertainment(int changeInValue) {
        entertainment = Math.max(0, Math.min(100, entertainment + changeInValue));
        notifyObservers();
    }
    public void modifyHappiness(int changeInValue) {
        happiness = Math.max(0, Math.min(100, happiness + changeInValue));
        notifyObservers();
    }


    // Getters
    public int getHealth() {
        return health;
    }

    public int getHunger() {
        return hunger;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public int getEntertainment() {
        return entertainment;
    }

    public int getHappiness() {
        return happiness;
    }

}

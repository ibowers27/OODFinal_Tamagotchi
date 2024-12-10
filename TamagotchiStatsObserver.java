/* Daniel Messiana, Ivy Bowers
 * 
 * This class observes the attributes of the Tamagotchi 
 * and updates the UI accordingly.
 * 
*/

public class TamagotchiStatsObserver implements Observer {
    private TamagotchiStats tamagotchiStats;

    public TamagotchiStatsObserver (TamagotchiStats tamagotchiStats) {
        this.tamagotchiStats = tamagotchiStats;
        this.tamagotchiStats.addObserver(this);
    }

    // This is called when any of the stats are changed by the publisher
    @Override
    public void update(int health, int hunger, int cleanliness, int entertainment, int happiness) {
        // We need to update the UI for each stat
        System.out.println("Health: " + health + "/100");
        System.out.println("Hunger: " + hunger + "/100");
        System.out.println("Cleanliness: " + cleanliness + "/100");
        System.out.println("Happiness: " + happiness + "/100");

        // Update the UI components (lables and happiness bar)
        //GameView.updateHealth(health);
        //GameView.updateHunger(hunger);
        //GameView.updateCleanliness(cleanliness);
        //GameView.updateEntertainment(entertainment);
        //GameView.updateHappinessBar(happiness);
    }
}

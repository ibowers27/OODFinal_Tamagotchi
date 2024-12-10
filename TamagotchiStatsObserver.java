/* Daniel Messiana, Ivy Bowers
 * 
 * This class observes the attributes of the Tamagotchi 
 * and updates the UI accordingly.
 * 
*/

import javax.swing.*;

public class TamagotchiStatsObserver implements Observer {
    private TamagotchiStats tamagotchiStats;

    // Reference UI components that will be changed
    private JLabel healthLabel, hungerLabel, cleanlinessLabel, entertainmentLabel;
    private JProgressBar happinessBar;

    public TamagotchiStatsObserver (TamagotchiStats tamagotchiStats, JLabel healthLabel, JLabel hungerLabel, JLabel cleanlinessLabel, JLabel entertainmentLabel, JProgressBar happinessBar) {
        this.tamagotchiStats = tamagotchiStats;
        this.tamagotchiStats.addObserver(this);

        // Save references to the UI components
        this.healthLabel = healthLabel;
        this.hungerLabel = hungerLabel;
        this.cleanlinessLabel = cleanlinessLabel;
        this.entertainmentLabel = entertainmentLabel;
        this.happinessBar = happinessBar;
    }

    // This is called when any of the stats are changed by the publisher
    @Override
    public void update(int health, int hunger, int cleanliness, int entertainment, int happiness) {
        // We need to update the UI for each stat
        SwingUtilities.invokeLater(() -> {
            System.out.println("Health: " + health + "/100");
            System.out.println("Hunger: " + hunger + "/100");
            System.out.println("Cleanliness: " + cleanliness + "/100");
            System.out.println("Entertainment: " + entertainment + "/100");
            System.out.println("Happiness: " + happiness + "/100");

            // uUpdate the labels and progress bar in the UI here
            healthLabel.setText("Health: " + health + "/100");
            hungerLabel.setText("Hunger: " + hunger + "/100");
            cleanlinessLabel.setText("Cleanliness: " + cleanliness + "/100");
            entertainmentLabel.setText("Entertainment: " + entertainment + "/100");
            happinessBar.setValue(happiness);
        });
    }
}

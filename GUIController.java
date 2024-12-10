import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** Ivy Bowers
 *  This is the controller for our UI. It handles passing values from the first page to the second and implements builder
 *  logic.
 */
public class GUIController implements ActionListener {
    private TamagotchiCreationView creationView;

    //Constructor initializing the controller with the form
    public GUIController(TamagotchiCreationView creationView) {
        this.creationView = creationView;
    }

    // Triggered when submit button is pressed
    @Override
    public void actionPerformed(ActionEvent e) {
        // If the submit button is clicked
        if (e.getSource() == creationView.submitButton) {
            // Collect the data from the form using getter methods
            String type = creationView.getPetType();
            String name = creationView.getName();
            String color = creationView.getColor();
            String uniqueTrait = creationView.getUniqueTrait();
            String accessory = creationView.getAccessory();
            String personality = creationView.getPersonality();

            // Choose the builder based on the type
            TamagotchiBuilder builder;
            switch (type) {
                case "Cat":
                    builder = new CatTamagotchiBuilder();
                    break;
                case "Dog":
                    builder = new DogTamagotchiBuilder();
                    break;
                case "Bunny":
                    builder = new BunnyTamagotchiBuilder();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown Tamagotchi type: " + type);
            }

            // Ensure the user input values for the Tamagotchi description
            if (name.isEmpty() || uniqueTrait.isEmpty() || accessory.isEmpty() || personality.isEmpty()) {
                JOptionPane.showMessageDialog(creationView,
                        "All fields must be filled out before submitting.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
            } else {

                // Create director and construct the user's customized Tamagotchi
                TamagotchiDirector tamagotchiDirector = new TamagotchiDirector(builder);

                // This is the customized Tamagotchi from; returns getTamagotchi()
                Tamagotchi tamagotchi = tamagotchiDirector.constructTamagotchi(name, color, uniqueTrait, accessory, personality);

                // Create the TamagotchiStats object
                TamagotchiStats tamagotchiStats = new TamagotchiStats();

                // Display the constructed tamagotchi's information on a new page
                new GameView(tamagotchi, type, tamagotchiStats);

                creationView.setVisible(false);  // Hide the intake form (first page)
            }
        }
    }
}
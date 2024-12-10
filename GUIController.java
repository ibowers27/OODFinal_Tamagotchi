import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

            // Display the submitted information on a new page (Creating a DisplayFormView object)
            new GameView(type, name, color, uniqueTrait, accessory, personality);
            creationView.setVisible(false);  // Hide the intake form
        }
        //// Event listener for the submit button
        //        submitButton.addActionListener(e ->
        //
        //    {
        //        // Get values from the input fields
        //        String name = nameField.getText();
        //        String color = (String) tamagotchiColorComboBox.getSelectedItem();
        //        String uniqueTrait = uniqueTraitField.getText();
        //        String accessory = accessoryField.getText();
        //        String personality = personalityField.getText();
        //
        //        // Get the selected Tamagotchi type from the combo box
        //        String selectedType = (String) tamagotchiTypeComboBox.getSelectedItem();
        //        TamagotchiBuilder builder;
        //
        //        // Based on user selection, choose the appropriate builder
        //        switch (selectedType) {
        //            case "Cat":
        //                builder = new CatTamagotchiBuilder();
        //                break;
        //            case "Dog":
        //                builder = new DogTamagotchiBuilder();
        //                break;
        //            case "Bunny":
        //                builder = new BunnyTamagotchiBuilder();
        //                break;
        //            default:
        //                builder = new CatTamagotchiBuilder(); // Default to Cat (or handle error)
        //                break;
        //        }
        //
        //        // Create the director and use it to construct the Tamagotchi
        //        TamagotchiDirector director = new TamagotchiDirector(builder);
        //        Tamagotchi tamagotchi = director.constructTamagotchi(name, color, uniqueTrait, accessory, personality);
        //
        //        // Print the created Tamagotchi (or update the UI with the result)
        //        System.out.println(tamagotchi);
        // });
    }
}
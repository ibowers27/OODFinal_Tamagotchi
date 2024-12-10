import javax.swing.*;
import java.awt.*;

/** Ivy Bowers
 *  This is the first page of our UI that acts as an input form to use for Tamagotchi creation and customization which
 *  will use the builder methods.
 */
public class TamagotchiCreationView extends JFrame {
    // Create labels for type, name, color, unique trait, accessory, and personality
    private JLabel typeLabel, nameLabel, colorLabel, uniqueTraitLabel, accessoryLabel, personalityLabel;

    // Create a button for submitting
    public JButton submitButton;

    // Create text input boxes for name, unique trait, accessory, and personality
    private JTextArea nameTextArea, uniqueTraitTextArea, accessoryTextArea, personalityTextArea;

    // Create comboboxes for type and color
    private JComboBox<String> typeComboBox, colorComboBox;

    // Constructor
    public TamagotchiCreationView() {
        super("Create Your Tamagotchi");

        // Controller that links display and action listeners
        GUIController controller = new GUIController(this);

        // Window features
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));
        setResizable(true);

        // Add form panel to the window
        add(inputForm());

        //Display the window
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        // Add action listeners for submit
        submitButton.addActionListener(controller);

    }

    // Input form panel
    public JPanel inputForm() {
        JPanel panel = new JPanel();

        // Type
        JPanel typePanel = new JPanel(new GridLayout(1, 2));
        typeLabel = new JLabel("Select Tamagotchi Pet Type");
        // ComboBox for selecting Tamagotchi type
        String[] typeOptions = {"Cat", "Dog", "Bunny"};
        typeComboBox = new JComboBox<>(typeOptions);
        typeComboBox.setPreferredSize(new Dimension(150, 25)); // Set preferred size for tamagotchi type dropdown
        typePanel.add(typeLabel);
        typePanel.add(typeComboBox);

        // Name
        JPanel namePanel = new JPanel(new GridLayout(1, 2));
        nameLabel = new JLabel("Name:");
        nameTextArea = new JTextArea();
        nameTextArea.setPreferredSize(new Dimension(150, 25)); // Set preferred size for name field
        namePanel.add(nameLabel);
        namePanel.add(nameTextArea);

        // Color
        JPanel colorPanel = new JPanel(new GridLayout(1, 2));
        colorLabel = new JLabel("Color");
        // ComboBox for selecting color
        String[] colorOptions = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Pink"};
        colorComboBox = new JComboBox<>(colorOptions);
        colorComboBox.setPreferredSize(new Dimension(150, 25)); // Set preferred size for color dropdown
        colorPanel.add(colorLabel);
        colorPanel.add(colorComboBox);

        // Unique Trait
        JPanel uniqueTraitPanel = new JPanel(new GridLayout(1, 2));
        uniqueTraitLabel = new JLabel("Unique Trait:");
        uniqueTraitTextArea = new JTextArea();
        uniqueTraitTextArea.setPreferredSize(new Dimension(150, 25)); // Set preferred size for unique trait field
        uniqueTraitPanel.add(uniqueTraitLabel);
        uniqueTraitPanel.add(uniqueTraitTextArea);

        // Accessory
        JPanel accessoryPanel = new JPanel(new GridLayout(1, 2));
        accessoryLabel = new JLabel("Accessory:");
        accessoryTextArea = new JTextArea();
        accessoryTextArea.setPreferredSize(new Dimension(150, 25)); // Set preferred size for accessory field
        accessoryPanel.add(accessoryLabel);
        accessoryPanel.add(accessoryTextArea);

        // Personality
        JPanel personalityPanel = new JPanel(new GridLayout(1, 2));
        personalityLabel = new JLabel("Personality:");
        personalityTextArea = new JTextArea();
        personalityTextArea.setPreferredSize(new Dimension(150, 25)); // Set preferred size for personality field
        personalityPanel.add(personalityLabel);
        personalityPanel.add(personalityTextArea);

        // Button to create the tamagotchi (submit input form)
        JPanel submitButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        submitButton = new JButton("Create Tamagotchi");
        submitButtonPanel.add(submitButton);

        // Add components to the panel
        panel.add(typePanel);
        panel.add(namePanel);
        panel.add(colorPanel);
        panel.add(uniqueTraitPanel);
        panel.add(accessoryPanel);
        panel.add(personalityPanel);
        panel.add(submitButtonPanel);

        return panel;
    }

    // Getters for display page
    public String getPetType() {
        return (String) typeComboBox.getSelectedItem();
    }

    public String getName() {
        return nameTextArea.getText();
    }

    public String getColor() {
        return (String) colorComboBox.getSelectedItem();
    }

    public String getUniqueTrait() {
        return uniqueTraitTextArea.getText();
    }

    public String getAccessory() {
        return accessoryTextArea.getText();
    }

    public String getPersonality() {
        return personalityTextArea.getText();
    }
}
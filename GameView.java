import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GameView extends JFrame {
    private Tamagotchi tamagotchi;
    private String petType;

    // Constructor
    public GameView(Tamagotchi tamagotchi, String petType) {
        super("Tamagotchi Game");

        this.tamagotchi = tamagotchi;
        this.petType = petType;

        // Window features
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 450));
        setResizable(true);

        // Create panel
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(10, 10, 10,10));
        panel.setLayout(new GridLayout(1, 2));  // 1 row, 2 columns

        // Create left panel for Tamagotchi description
        JPanel descriptionPanel = new JPanel();
        descriptionPanel.setLayout(new BoxLayout(descriptionPanel, BoxLayout.Y_AXIS));
        descriptionPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Add padding

        // Add components of the description panel
        descriptionPanel.add(new JLabel("Tamagotchi Type: " + petType));
        descriptionPanel.add(new JLabel("Pet Name: " + getTamagotchiDetails("Name")));
        descriptionPanel.add(new JLabel("Pet Color: " + getTamagotchiDetails("Color")));
        descriptionPanel.add(new JLabel("Pet's Unique Trait: " + getTamagotchiDetails("Unique Trait")));
        descriptionPanel.add(new JLabel("Pet's Favorite Accessory: " + getTamagotchiDetails("Accessory")));
        descriptionPanel.add(new JLabel("Pet Personality: " + getTamagotchiDetails("Personality")));

        // Create a panel for an image of the pet
        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(new BorderLayout());

        // Set image based on pet type
        // Set the image based on the pet type using a switch case
        ImageIcon petImage = null;
        switch (petType.toLowerCase()) {
            case "cat":
                petImage = new ImageIcon(getClass().getResource("cat.png"));
                break;
            case "dog":
                petImage = new ImageIcon(getClass().getResource("dog.png"));
                break;
            case "bunny":
                petImage = new ImageIcon(getClass().getResource("bunny.png"));
                break;
        }

        // Add the image to a label
        JLabel imageLabel = new JLabel(petImage);
        imagePanel.add(imageLabel, BorderLayout.NORTH);

        // Add both panels to the main panel (description on the left, image on the right)
        panel.add(descriptionPanel);  // Add description panel to the left (column 1)
        panel.add(imagePanel);  // Add image panel to the right (column 2)

        // Add main panel
        add(panel);

        // Display the window
        pack();
        setVisible(true);
    }

    private String getTamagotchiDetails(String detail) {
        switch (detail) {
            case "Type":
                return tamagotchi.getClass().getSimpleName().replace("TamagotchiBuilder", "");
            case "Name":
                return tamagotchi.getName();
            case "Color":
                return tamagotchi.getColor();
            case "Unique Trait":
                return tamagotchi.getUniqueTrait();
            case "Accessory":
                return tamagotchi.getAccessory();
            case "Personality":
                return tamagotchi.getPersonality();
            default:
                return "Unknown";
        }
    }
}
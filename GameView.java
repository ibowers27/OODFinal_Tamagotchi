import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/** Ivy Bowers
 *  This is the second page of our UI that acts as the "game."
 */
public class GameView extends JFrame {
    private Tamagotchi tamagotchi;
    private String petType;
    private TamagotchiStats tamagotchiStats;

    // Constructor
    public GameView(Tamagotchi tamagotchi, String petType, TamagotchiStats tamagotchiStats) {
        super("Tamagotchi Game");

        this.tamagotchi = tamagotchi;
        this.petType = petType;
        this.tamagotchiStats = tamagotchiStats;

        // Window features
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 500));
        setResizable(true);

        // Create panel
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(10, 10, 10,10));
        panel.setLayout(new GridLayout(4, 2));  // 1 row, 2 columns

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

        // Create a panel for the happiness bar
        JPanel happinessPanel = new JPanel();

        // Add a bar for happiness
        JProgressBar happinessBar = new JProgressBar(0, 100);
        happinessBar.setValue(tamagotchiStats.getHappiness());
        happinessBar.setPreferredSize(new Dimension(100,10));
        happinessPanel.add(new JLabel("Happiness: "));
        happinessPanel.add(happinessBar);

        panel.add(happinessPanel);

        // Create a blank panel for padding
        JPanel blankPanel = new JPanel();

        JLabel blankLabel = new JLabel("");

        blankPanel.add(blankLabel);

        panel.add(blankPanel);

        // Add stats labels (Cleanliness, Health, Hunger, Entertainment)
        JPanel statsPanelLeft = new JPanel();
        statsPanelLeft.setLayout(new GridLayout(1, 2));

        JPanel statsPanelRight = new JPanel();
        statsPanelRight.setLayout(new GridLayout(1, 2));

        JLabel healthLabel = new JLabel("Health: " + tamagotchiStats.getHealth() + "/100");
        JLabel hungerLabel = new JLabel("Hunger: " + tamagotchiStats.getHunger() + "/100");
        JLabel cleanlinessLabel = new JLabel("Cleanliness: " + tamagotchiStats.getCleanliness() + "/100");
        JLabel entertainmentLabel = new JLabel("Entertainment: " + tamagotchiStats.getEntertainment() + "/100");

        statsPanelLeft.add(healthLabel);
        statsPanelLeft.add(hungerLabel);
        statsPanelRight.add(cleanlinessLabel);
        statsPanelRight.add(entertainmentLabel);

        panel.add(statsPanelLeft);
        panel.add(statsPanelRight);

        // Create a left panel for the buttons
        JPanel buttonPanelLeft = new JPanel();
        buttonPanelLeft.setLayout(new GridLayout(1, 2));

        // Create a right panel for the buttons
        JPanel buttonPanelRight = new JPanel();
        buttonPanelRight.setLayout(new GridLayout(1, 2));

        // Buttons for interacting with the Tamagotchi
        JButton cleanButton = new JButton("Clean");
        JButton healButton = new JButton("Heal");
        JButton feedButton = new JButton("Feed");
        JButton playButton = new JButton("Play");

        // Add action listeners (could be implemented later)
        cleanButton.addActionListener(e -> System.out.println("Clean button pressed"));
        healButton.addActionListener(e -> System.out.println("Heal button pressed"));
        feedButton.addActionListener(e -> System.out.println("Feed button pressed"));
        playButton.addActionListener(e -> System.out.println("Play button pressed"));

        // Add buttons to button panel
        buttonPanelLeft.add(cleanButton);
        buttonPanelLeft.add(healButton);
        buttonPanelRight.add(feedButton);
        buttonPanelRight.add(playButton);

        panel.add(buttonPanelLeft);
        panel.add(buttonPanelRight);

        // Add main panel
        add(panel);

        // Display the window
        pack();
        setLocationRelativeTo(null);
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
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/** Ivy Bowers, Angelo Morelli
 *  This is the second page of our UI that acts as the "game." This is where commands, observers, and sounds are handled.
 */
public class GameView extends JFrame {
    private Tamagotchi tamagotchi;
    private String petType;
    private TamagotchiStats tamagotchiStats;

    // Observed UI components
    private JLabel healthLabel;
    private JLabel hungerLabel;
    private JLabel cleanlinessLabel;
    private JLabel entertainmentLabel;
    private JProgressBar happinessBar;

    // Constructor
    public GameView(Tamagotchi tamagotchi, String petType, TamagotchiStats tamagotchiStats) {
        super("Tamagotchi Game");

        this.tamagotchi = tamagotchi;
        this.petType = petType;
        this.tamagotchiStats = tamagotchiStats;

        // Initialize UI components that will be affected by command buttons
        healthLabel = new JLabel("Health: " + tamagotchiStats.getHealth() + "/100");
        hungerLabel = new JLabel("Hunger: " + tamagotchiStats.getHunger() + "/100");
        cleanlinessLabel = new JLabel("Cleanliness: " + tamagotchiStats.getCleanliness() + "/100");
        entertainmentLabel = new JLabel("Entertainment: " + tamagotchiStats.getEntertainment() + "/100");
        happinessBar = new JProgressBar(0, 100);
        happinessBar.setValue(tamagotchiStats.getHappiness());

        // Register the observer with tamagotchiStats (Observable) and the UI details
        new TamagotchiStatsObserver(tamagotchiStats, healthLabel, hungerLabel, cleanlinessLabel, entertainmentLabel, happinessBar);


        // Instantiate SoundClipPlayer instance and load sound clips
        SoundClipPlayer player = new SoundClipPlayer("out/resources");
        player.loadClip("sleep", "kb_sleepingcat_short-36741.wav");
        player.loadClip("heal", "health-pickup-6860.wav");
        player.loadClip("eat", "eating-sound-effect-36186.wav");
        player.loadClip("play", "boing-spring-mouth-harp-04-20-13-4-103346.wav");

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

        // Add action listeners for each button that connects to commands and executes
        cleanButton.addActionListener(e -> {
            System.out.println("Clean button pressed");
            Command cleanCommand = new CleanCommand();
            cleanCommand.execute(tamagotchiStats);
            player.playClip("sleep");
        });

        healButton.addActionListener(e -> {
            System.out.println("Heal button pressed");
            Command healCommand = new HealCommand();
            healCommand.execute(tamagotchiStats);
            player.playClip("heal");
        });

        feedButton.addActionListener(e -> {
            System.out.println("Feed button pressed");
            Command feedCommand = new FeedCommand();
            feedCommand.execute(tamagotchiStats);
            player.playClip("eat");
        });

        playButton.addActionListener(e -> {
            System.out.println("Play button pressed");
            Command playCommand = new PlayCommand();
            playCommand.execute(tamagotchiStats);
            player.playClip("play");
        });

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
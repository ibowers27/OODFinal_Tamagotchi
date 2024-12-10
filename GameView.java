import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GameView extends JFrame {
    public GameView(String type, String name, String color, String uniqueTrait, String accessory, String personality) {
        super("Tamagotchi Game");

        // Window features
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));
        setResizable(true);

        // This window isn't as complex, so we didn't make a separate method for the panel
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(10, 15, 10,30));

        // BoxLayout orders the panel's features vertically (Y_AXIS)
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add components to the panel; we use
        panel.add(new JLabel("Tamagotchi Type: " + type));
        panel.add(new JLabel("Pet Name: " + name));
        panel.add(new JLabel("Pet Color: " + color));
        panel.add(new JLabel("Pet's Unique Trait: " + uniqueTrait));
        panel.add(new JLabel("Pet's Favorite Accessory: " + accessory));
        panel.add(new JLabel("Pet Personality: " + personality));

        // Add the panel itself
        add(panel);

        // Display the window
        pack();
        setVisible(true);
    }
}
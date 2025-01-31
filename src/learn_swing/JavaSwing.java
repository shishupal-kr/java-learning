package learn_swing;

import Swing.ButtonSwing;

import javax.swing.*;
import java.awt.*;

public class JavaSwing extends JFrame {

    public JavaSwing() {
        setTitle("Swing Components Learning");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the main panel that will hold all components
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        add(mainPanel);

        // Add panels with components
        mainPanel.add(new ButtonPanel());
        mainPanel.add(new ToggleButtonPanel());
        mainPanel.add(new RadioButtonPanel());
        mainPanel.add(new CheckboxPanel());

        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            ButtonSwing frame = new ButtonSwing();
            frame.setVisible(true);
        });

        new JavaSwing();
    }
}
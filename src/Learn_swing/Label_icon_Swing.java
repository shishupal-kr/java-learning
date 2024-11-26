package Learn_swing;

import javax.swing.*;

public class Label_icon_Swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Labels and Icons Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null); // Use null layout

        // JLabel for text
        //JLabel is used to display text, images, or both. It is a non-editable component and commonly
        // used for providing instructions, titles, or descriptions.
        JLabel textLabel = new JLabel("Welcome to Swing!");
        textLabel.setBounds(50, 20, 300, 30);
        frame.add(textLabel);

        // JLabel with ImageIconI
        // ImageIcon is used to load and display images in components like JLabel, JButton, etc.
        ImageIcon icon = new ImageIcon("/Users/shishupal/Pictures/calc.jpeg"); // Replace with an actual path
        JLabel iconLabel = new JLabel(icon);
        iconLabel.setBounds(50, 70, 200, 150);
        frame.add(iconLabel);

        // JButton with tooltip
        //JToolTip provides a small pop-up hint when the user hovers over a component.
        //Tooltips are set using the setToolTipText method on any Swing component.
        JButton button = new JButton("Hover me");
        button.setBounds(50, 240, 150, 30);
        button.setToolTipText("This is a helpful tooltip");
        frame.add(button);

        // Display the frame
        frame.setVisible(true);
    }
}
package Swing;

import javax.swing.*;
import java.awt.*;

public class Layout_Examples extends JFrame {

    public Layout_Examples() {
        setTitle("Java Layout Examples");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create CardLayout container
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        // Null Layout
        JPanel nullLayoutPanel = new JPanel(null);
        JButton btn1 = new JButton("Button 1");
        btn1.setBounds(50, 50, 100, 30);
        JButton btn2 = new JButton("Button 2");
        btn2.setBounds(200, 50, 100, 30);
        nullLayoutPanel.add(btn1);
        nullLayoutPanel.add(btn2);

        // FlowLayout
        JPanel flowLayoutPanel = new JPanel(new FlowLayout());
        flowLayoutPanel.add(new JButton("Button 1"));
        flowLayoutPanel.add(new JButton("Button 2"));
        flowLayoutPanel.add(new JButton("Button 3"));

        // BorderLayout
        JPanel borderLayoutPanel = new JPanel(new BorderLayout());
        borderLayoutPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderLayoutPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderLayoutPanel.add(new JButton("East"), BorderLayout.EAST);
        borderLayoutPanel.add(new JButton("West"), BorderLayout.WEST);
        borderLayoutPanel.add(new JButton("Center"), BorderLayout.CENTER);

        // GridLayout
        JPanel gridLayoutPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        gridLayoutPanel.add(new JButton("Button 1"));
        gridLayoutPanel.add(new JButton("Button 2"));
        gridLayoutPanel.add(new JButton("Button 3"));
        gridLayoutPanel.add(new JButton("Button 4"));

        // BoxLayout
        JPanel boxLayoutPanel = new JPanel();
        boxLayoutPanel.setLayout(new BoxLayout(boxLayoutPanel, BoxLayout.Y_AXIS));
        boxLayoutPanel.add(new JButton("Button 1"));
        boxLayoutPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Add space
        boxLayoutPanel.add(new JButton("Button 2"));
        boxLayoutPanel.add(Box.createVerticalGlue()); // Push components apart
        boxLayoutPanel.add(new JButton("Button 3"));

        // CardLayout (self-referential example)
        JPanel cardLayoutPanel = new JPanel(new CardLayout());
        cardLayoutPanel.add(new JButton("Card 1"), "Card 1");
        cardLayoutPanel.add(new JButton("Card 2"), "Card 2");
        CardLayout cardExample = (CardLayout) cardLayoutPanel.getLayout();
        cardExample.show(cardLayoutPanel, "Card 1");

        // GridBagLayout
        JPanel gridBagLayoutPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gridBagLayoutPanel.add(new JButton("Button 1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gridBagLayoutPanel.add(new JButton("Button 2"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gridBagLayoutPanel.add(new JButton("Button 3"), gbc);

        // Add panels to mainPanel
        mainPanel.add(nullLayoutPanel, "Null Layout");
        mainPanel.add(flowLayoutPanel, "Flow Layout");
        mainPanel.add(borderLayoutPanel, "Border Layout");
        mainPanel.add(gridLayoutPanel, "Grid Layout");
        mainPanel.add(boxLayoutPanel, "Box Layout");
        mainPanel.add(gridBagLayoutPanel, "GridBag Layout");

        // Navigation panel to switch layouts
        JPanel navigationPanel = new JPanel(new FlowLayout());
        JButton nullButton = new JButton("Null Layout");
        JButton flowButton = new JButton("Flow Layout");
        JButton borderButton = new JButton("Border Layout");
        JButton gridButton = new JButton("Grid Layout");
        JButton boxButton = new JButton("Box Layout");
        JButton gridBagButton = new JButton("GridBag Layout");

        nullButton.addActionListener(e -> cardLayout.show(mainPanel, "Null Layout"));
        flowButton.addActionListener(e -> cardLayout.show(mainPanel, "Flow Layout"));
        borderButton.addActionListener(e -> cardLayout.show(mainPanel, "Border Layout"));
        gridButton.addActionListener(e -> cardLayout.show(mainPanel, "Grid Layout"));
        boxButton.addActionListener(e -> cardLayout.show(mainPanel, "Box Layout"));
        gridBagButton.addActionListener(e -> cardLayout.show(mainPanel, "GridBag Layout"));

        navigationPanel.add(nullButton);
        navigationPanel.add(flowButton);
        navigationPanel.add(borderButton);
        navigationPanel.add(gridButton);
        navigationPanel.add(boxButton);
        navigationPanel.add(gridBagButton);

        // Add navigation and main panels to frame
        add(navigationPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Layout_Examples();
    }
}
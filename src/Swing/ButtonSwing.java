package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSwing extends JFrame {

    public ButtonSwing(){

        JFrame jframe = new JFrame();
        jframe.setTitle("Swing Components Learning");

        //1. jbutton
        JButton button = new JButton("Submit");
        button.setBounds(40,5,80,30);
        jframe.add(button);

        // Add an ActionListener to handle the button click event
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a message when the button is clicked
                JOptionPane.showMessageDialog(jframe, "Button was clicked!");
            }
        });


        // 2. Toggle button
        JToggleButton jtoggle = new JToggleButton("OFF");
        jtoggle.setBounds(40, 30, 80, 30);
        jtoggle.setBackground(Color.red);
        jtoggle.setOpaque(true);
        jtoggle.setContentAreaFilled(true);
        jtoggle.setIcon(new ImageIcon("off_icon.png"));
        jtoggle.setSelectedIcon(new ImageIcon("on_icon.png"));
        jframe.add(jtoggle);
        // Add an ActionListener to handle the toggle button state change
        jtoggle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jtoggle.isSelected()) {
                    // When the button is selected, change text and background color
                    jtoggle.setText("ON");
                    jtoggle.setBackground(Color.GREEN);
                } else {
                    // When the button is unselected, revert text and background color
                    jtoggle.setText("OFF");
                    jtoggle.setBackground(Color.RED);
                }
            }
        });


        // 3. radio buttons
        JRadioButton option1 = new JRadioButton("Option 1");
        option1.setBounds(40, 60, 100, 30);
        JRadioButton option2 = new JRadioButton("Option 2");
        option2.setBounds(40, 80, 80, 30);
        JRadioButton option3 = new JRadioButton("Option 3");
        option3.setBounds(40, 100, 80, 30);
        // Group the radio buttons - make them mutually select only one
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        ActionListener actionistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton selectedButton = (JRadioButton) e.getSource();
                JOptionPane.showMessageDialog(jframe, "You selected: " + selectedButton.getText());
            }
        };
        // Attach the ActionListener to each radio button
        option1.addActionListener(actionistener);
        option2.addActionListener(actionistener);
        option3.addActionListener(actionistener);

        jframe.add(option1);
        jframe.add(option2);
        jframe.add(option3);


        // 4. checkboxes
        JCheckBox gender1 = new JCheckBox("Male");
        gender1.setBounds(40, 120, 80, 30);
        JCheckBox gender2 = new JCheckBox("Female");
        gender2.setBounds(40, 140, 80, 30);
        JCheckBox gender3 = new JCheckBox("other");
        gender3.setBounds(40, 160, 80, 30);
        //use ButtonGroup if needed
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(gender1);
        genderGroup.add(gender2);
        genderGroup.add(gender3);

        // Add an ActionListener to handle checkbox selection
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox checkbox = (JCheckBox) e.getSource();
                String status = checkbox.isSelected() ? "selected" : "deselected";
                JOptionPane.showMessageDialog(jframe, checkbox.getText() + " is " + status);
            }
        };
        // Attach the ActionListener to each checkbox
        gender1.addActionListener(actionListener);
        gender2.addActionListener(actionListener);
        gender3.addActionListener(actionListener);

        jframe.add(gender1);
        jframe.add(gender2);
        jframe.add(gender3);

        jframe.setLayout(null);
        jframe.setSize(800, 800);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
    public static void main(String[] args) {
        new ButtonSwing();

    }
}
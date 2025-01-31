package learn_swing;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {

    public ButtonPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton button = new JButton("Submit");
        button.setBounds(150, 300, 80, 30);
        add(button);
    }
}
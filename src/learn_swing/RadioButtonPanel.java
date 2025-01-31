package learn_swing;

import javax.swing.*;
import java.awt.*;

public class RadioButtonPanel extends JPanel {

    public RadioButtonPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JRadioButton option1 = new JRadioButton("Option 1");
        JRadioButton option2 = new JRadioButton("Option 2");
        JRadioButton option3 = new JRadioButton("Option 3");

        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);

        add(option1);
        add(option2);
        add(option3);
    }
}
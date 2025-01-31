package learn_swing;


import javax.swing.*;
import java.awt.*;

public class CheckboxPanel extends JPanel {

    public CheckboxPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JCheckBox gender1 = new JCheckBox("Male");
        JCheckBox gender2 = new JCheckBox("Female");
        JCheckBox gender3 = new JCheckBox("Other");

        add(gender1);
        add(gender2);
        add(gender3);
    }
}

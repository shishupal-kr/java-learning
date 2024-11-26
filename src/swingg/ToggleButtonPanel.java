package swingg;

import javax.swing.*;
import java.awt.*;

public class ToggleButtonPanel extends JPanel {

    public ToggleButtonPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JToggleButton jtoggle = new JToggleButton("OFF");
        jtoggle.setBounds(40, 40, 80, 30);
        jtoggle.setBackground(Color.RED);
        jtoggle.setOpaque(true);
        jtoggle.setContentAreaFilled(true);
        jtoggle.setIcon(new ImageIcon("off_icon.png"));
        jtoggle.setSelectedIcon(new ImageIcon("on_icon.png"));
        add(jtoggle);
    }
}
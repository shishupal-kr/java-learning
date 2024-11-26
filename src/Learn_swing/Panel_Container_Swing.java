package Learn_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel_Container_Swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panels and Containers Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);

        // JPanel Example
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(20, 20, 200, 100);
        panel.add(new JLabel("This is a JPanel"));
        frame.add(panel);

        // JTabbedPane Example
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(250, 20, 300, 150);
        tabbedPane.add("Tab 1", new JLabel("Content for Tab 1"));
        tabbedPane.add("Tab 2", new JLabel("Content for Tab 2"));
        frame.add(tabbedPane);

        // JSplitPane Example
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                new JLabel("Left Component"), new JLabel("Right Component"));
        splitPane.setBounds(20, 150, 300, 100);
        frame.add(splitPane);

        // JScrollPane Example
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(20, 270, 300, 100);
        frame.add(scrollPane);

        // JLayeredPane Example
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(350, 200, 300, 200);
        JLabel topLabel = new JLabel("Top Layer");
        topLabel.setBackground(Color.RED);
        topLabel.setOpaque(true);
        topLabel.setBounds(50, 50, 100, 50);

        JLabel bottomLabel = new JLabel("Bottom Layer");
        bottomLabel.setBackground(Color.BLUE);
        bottomLabel.setOpaque(true);
        bottomLabel.setBounds(70, 70, 100, 50);

        layeredPane.add(bottomLabel, Integer.valueOf(1));
        layeredPane.add(topLabel, Integer.valueOf(2));
        frame.add(layeredPane);

        // JDesktopPane and JInternalFrame Example
        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBounds(20, 400, 300, 150);

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(200, 100);
        internalFrame.setVisible(true);
        desktopPane.add(internalFrame);
        frame.add(desktopPane);

        // JDialog Example
        JButton dialogButton = new JButton("Show Dialog");
        dialogButton.setBounds(400, 450, 150, 30);
        dialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(frame, "Dialog Example", true);
                dialog.setSize(200, 100);
                dialog.setLayout(new FlowLayout());
                dialog.add(new JLabel("This is a dialog"));
                JButton closeButton = new JButton("Close");
                closeButton.addActionListener(event -> dialog.dispose());
                dialog.add(closeButton);
                dialog.setLocationRelativeTo(frame);
                dialog.setVisible(true);
            }
        });
        frame.add(dialogButton);

        frame.setVisible(true);
    }
}
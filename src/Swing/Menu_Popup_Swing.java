package Swing;
import javax.swing.*;
import java.awt.event.*;

public class Menu_Popup_Swing {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Menus and Popup Menus Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(null);

        // JMenuBar with JMenu and JMenuItem
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("Show Grid");
        editMenu.add(checkBoxMenuItem);

        JRadioButtonMenuItem rb1 = new JRadioButtonMenuItem("Option 1");
        JRadioButtonMenuItem rb2 = new JRadioButtonMenuItem("Option 2");
        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        editMenu.add(rb1);
        editMenu.add(rb2);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        frame.setJMenuBar(menuBar);

        // Add action listeners for JMenuItem
        exitItem.addActionListener(e -> System.exit(0));
        openItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Open clicked"));
        saveItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Save clicked"));

        // Popup Menu
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        popupMenu.add(cutItem);
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);

        // Add a MouseListener to show the popup menu
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                showPopup(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                showPopup(e);
            }

            private void showPopup(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        // Add action listeners to menu items
        cutItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Cut clicked"));
        copyItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Copy clicked"));
        pasteItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Paste clicked"));


        // Display the frame
        frame.setVisible(true);
    }
}
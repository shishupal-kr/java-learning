package Learn_swing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class List_Table_Swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Components Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);

        // JList Example
        JLabel listLabel = new JLabel("JList:");
        listLabel.setBounds(20, 20, 100, 20);
        frame.add(listLabel);

        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JList<String> list = new JList<>(items);
        JScrollPane listScrollPane = new JScrollPane(list);
        listScrollPane.setBounds(20, 50, 120, 80);
        frame.add(listScrollPane);

        // JTable Example
        JLabel tableLabel = new JLabel("JTable:");
        tableLabel.setBounds(200, 20, 100, 20);
        frame.add(tableLabel);

        String[][] data = {
                {"1", "Alice", "Developer"},
                {"2", "Bob", "Designer"},
                {"3", "Charlie", "Manager"}
        };
        String[] columns = {"ID", "Name", "Role"};
        JTable table = new JTable(data, columns);
        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setBounds(200, 50, 300, 100);
        frame.add(tableScrollPane);

        // JComboBox Example
        JLabel comboBoxLabel = new JLabel("JComboBox:");
        comboBoxLabel.setBounds(20, 150, 100, 20);
        frame.add(comboBoxLabel);

        String[] comboItems = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(comboItems);
        comboBox.setBounds(20, 180, 150, 30);
        frame.add(comboBox);

        // JTree Example
        JLabel treeLabel = new JLabel("JTree:");
        treeLabel.setBounds(200, 180, 100, 20);
        frame.add(treeLabel);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);
        child1.add(new DefaultMutableTreeNode("Child 1.1"));

        JTree tree = new JTree(root);
        JScrollPane treeScrollPane = new JScrollPane(tree);
        treeScrollPane.setBounds(200, 210, 200, 150);
        frame.add(treeScrollPane);

        frame.setVisible(true);
    }
}
package Swing;
import javax.swing.*;

public class TextSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Components with Null Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(null); // Set the layout to null

        // JTextField
        JLabel textFieldLabel = new JLabel("Single-line Text:");
        textFieldLabel.setBounds(20, 20, 120, 25);
        JTextField textField = new JTextField(20);
        textField.setBounds(150, 20, 200, 25);
        frame.add(textFieldLabel);
        frame.add(textField);

        // JPasswordField
        JLabel passwordFieldLabel = new JLabel("Password:");
        passwordFieldLabel.setBounds(20, 60, 120, 25);
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(150, 60, 200, 25);
        frame.add(passwordFieldLabel);
        frame.add(passwordField);

        // JTextArea
        JLabel textAreaLabel = new JLabel("Multi-line Text:");
        textAreaLabel.setBounds(20, 100, 120, 25);
        JTextArea textArea = new JTextArea(6, 20);
        JScrollPane textAreaScroll = new JScrollPane(textArea);
        textAreaScroll.setBounds(150, 100, 200, 80);
        frame.add(textAreaLabel);
        frame.add(textAreaScroll);

        // JTextPane
        JLabel textPaneLabel = new JLabel("Rich Text:");
        textPaneLabel.setBounds(20, 200, 120, 25);
        JTextPane textPane = new JTextPane();
        textPane.setText("Styled text in JTextPane.");
        JScrollPane textPaneScroll = new JScrollPane(textPane);
        textPaneScroll.setBounds(150, 200, 200, 60);
        frame.add(textPaneLabel);
        frame.add(textPaneScroll);

        // JEditorPane
        JLabel editorPaneLabel = new JLabel("HTML Content:");
        editorPaneLabel.setBounds(20, 270, 120, 25);
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setText("<html><b>This</b> is <i>HTML</i> content.</html>");
        JScrollPane editorPaneScroll = new JScrollPane(editorPane);
        editorPaneScroll.setBounds(150, 270, 200, 60);
        frame.add(editorPaneLabel);
        frame.add(editorPaneScroll);

        frame.setVisible(true);
    }
}
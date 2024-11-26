package myframe;
import java.awt.*;
import java.awt.event.*;

public class framecreate extends Frame implements WindowListener, ActionListener {

    Label label;
    Frame frame;

    public framecreate() {

        frame = new Frame("hello frame");

        Button button = new Button("click");
        button.setBounds(20, 40, 100, 30);

        label = new Label("you can write anything here");
        label.setBounds(20, 80, 150, 30);

        TextField textfield = new TextField();
        textfield.setBounds(20, 120, 100, 20);

        // Checkbox
        Checkbox checkbox = new Checkbox("java");
        checkbox.setBounds(20, 160, 80, 30);

        Checkbox checkbox1 = new Checkbox("python");
        checkbox1.setBounds(20, 200, 80, 30);

        // Choice
        Choice choice = new Choice();
        choice.setBounds(20, 240, 100, 30);
        choice.add("option 1");
        choice.add("option 2");
        choice.add("option 3");

        // List
        List list = new List();
        list.setBounds(20, 280, 100, 60);
        list.add("L1");
        list.add("L2");

        // Menu bar
        MenuBar menubar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu helpMenu = new Menu("Help");
        menubar.add(fileMenu);
        menubar.add(helpMenu);

        MenuItem openitem = new MenuItem("Open");
        MenuItem saveitem = new MenuItem("Save");
        MenuItem helplink = new MenuItem("help_link");
        fileMenu.add(openitem);
        fileMenu.add(saveitem);
        helpMenu.add(helplink);

        // Popup menu
        PopupMenu popupmenu = new PopupMenu();
        MenuItem cutitem = new MenuItem("cut");
        MenuItem copyitem = new MenuItem("copy");
        MenuItem pasteitem = new MenuItem("paste");
        popupmenu.add(cutitem);
        popupmenu.add(copyitem);
        popupmenu.add(pasteitem);

        // Panel
        Panel panel = new Panel();
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Dialog box button
        Button showdialogBox = new Button("show dialog box");
        showdialogBox.setBounds(150, 320, 120, 30);
        frame.add(showdialogBox);

        // Dialog box
        Dialog dialogBox = new Dialog(frame, "This is a dialog box");
        dialogBox.setSize(150, 100);
        dialogBox.setLayout(new FlowLayout());
        dialogBox.setLocationRelativeTo(frame);

        // Dialog box buttons
        Button okbutton = new Button("OK");
        Button cancelbutton = new Button("Cancel");
        dialogBox.add(okbutton);
        dialogBox.add(cancelbutton);

        showdialogBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogBox.setVisible(true);
            }
        });

        okbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogBox.setVisible(false);
            }
        });

        cancelbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogBox.setVisible(false);
            }
        });

        // Add components to frame
        frame.add(button);
        frame.add(label);
        frame.add(textfield);
        frame.add(checkbox);
        frame.add(checkbox1);
        frame.add(choice);
        frame.add(list);
        frame.setMenuBar(menubar);
        frame.add(popupmenu);
        frame.add(panel);

        // Set frame properties
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLayout(null);

        // Add item listener for List
        list.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String selected = list.getSelectedItem();
                System.out.println("Selected: " + selected);
            }
        });

        // Add window listener
        frame.addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("button clicked successfully");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        // Implemented method from WindowListener
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0); // Exit the application when window is closing
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // Implemented method from WindowListener
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // Implemented method from WindowListener
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // Implemented method from WindowListener
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // Implemented method from WindowListener
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // Implemented method from WindowListener
    }

    public static void main(String[] args) {
        new framecreate();
    }
}

package Frame;
import java.awt.*;

public class main {
    public static void main(String[] args) {

        // Create a frame instance
        Frame frame = new Frame("Demographic Details");

        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        MenuBar menubar = new MenuBar();
        Menu file = new Menu("File");
        Menu view = new Menu("View");
        Menu about = new Menu("About");
        Menu help = new Menu("Help");
        menubar.add(file);
        menubar.add(view);
        menubar.add(about);
        menubar.add(help);
        MenuItem fileitem = new MenuItem("Save");
        view.add(fileitem);
        frame.setMenuBar(menubar);

        Label namelabel = new Label("Full Name :");
        namelabel.setBounds(20, 60, 80, 30);
        frame.add(namelabel);
        TextField namefield = new TextField();
        namefield.setBounds(100, 65, 150, 20);
        frame.add(namefield);

        Label gender = new Label("Gender :");
        gender.setBounds(20, 90, 70, 30);
        frame.add(gender);
        Choice choice = new Choice();
        choice.setBounds(80, 95, 90, 20);
        choice.add("Male");
        choice.add("Female");
        choice.add("Other");
        frame.add(choice);

        /*Checkbox Male = new Checkbox("Male");
        Male.setBounds(90,90,100,30);
        frame.add(Male);
        Checkbox Female = new Checkbox("Female");
        Female.setBounds(190,90,100,30);
        frame.add(Female);*/

        Label fathername = new Label("Father Name :");
        fathername.setBounds(20, 120, 100, 30);
        frame.add(fathername);
        TextField fnamefield = new TextField();
        fnamefield.setBounds(120, 125, 150, 20);
        frame.add(fnamefield);

        Label dob = new Label("Date Of Birth :");
        dob.setBounds(20, 150, 90, 30);
        frame.add(dob);
        TextField dobs = new TextField();
        dobs.setBounds(120, 155, 100, 20);
        frame.add(dobs);

        Label Mobileno = new Label("Mobile Number :");
        Mobileno.setBounds(20, 180, 110, 30);
        frame.add(Mobileno);
        TextField mobilefield = new TextField();
        mobilefield.setBounds(130, 185, 130, 20);
        frame.add(mobilefield);

        Label emailid = new Label("Email ID :");
        emailid.setBounds(20, 210, 110, 30);
        frame.add(emailid);
        TextField emailfield = new TextField();
        emailfield.setBounds(130, 215, 180, 20);
        frame.add(emailfield);

       /* Panel panel = new Panel();
        Button helpbtn = new Button();
        panel.setLayout(new FlowLayout());
        panel.add(namelabel);
        frame.add(panel);*/

        Button button = new Button("Submit");
        button.setBounds(170, 340, 80, 30);
        frame.add(button);

        //attach window listener to main file
        frame.addWindowListener(new windowlistener());

    }
}
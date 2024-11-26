package learn_frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextField;
import java.awt.Choice;

public class actionlistener implements ActionListener {
    private TextField nameField;
    private TextField fatherNameField;
    private TextField dobField;
    private TextField mobileField;
    private TextField emailField;
    private Choice genderChoice;

    public actionlistener(TextField nameField, TextField fatherNameField, TextField dobField,
                          TextField mobileField, TextField emailField, Choice genderChoice) {
        this.nameField = nameField;
        this.fatherNameField = fatherNameField;
        this.dobField = dobField;
        this.mobileField = mobileField;
        this.emailField = emailField;
        this.genderChoice = genderChoice;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click
        System.out.println("Submit button clicked!");
        System.out.println("Full Name: " + nameField.getText());
        System.out.println("Gender: " + genderChoice.getSelectedItem());
        System.out.println("Father's Name: " + fatherNameField.getText());
        System.out.println("Date of Birth: " + dobField.getText());
        System.out.println("Mobile Number: " + mobileField.getText());
        System.out.println("Email ID: " + emailField.getText());
    }
}
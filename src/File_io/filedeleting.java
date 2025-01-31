package File_io;
import java.io.File;

public class filedeleting {
    public static void main(String[] args) {

        File mac = new File("spec.txt");

        if (mac.delete())
        {
            System.out.println("Deleted the file: " + mac.getName());
        }
        else {
            System.out.println("Failed to delete the file.");
        }
    }
}

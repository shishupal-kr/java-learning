package File_io;
import java.io.File;

public class fileinfo {
    public static void main(String[] args) {

        File mac = new File("spec.txt");

        if (mac.exists())
        {
            System.out.println("File name: " + mac.getName());
            System.out.println("Absolute path: " + mac.getAbsolutePath());
            System.out.println("Writeable: " + mac.canWrite());
            System.out.println("Readable " + mac.canRead());
            System.out.println("File size in bytes " + mac.length());
        }
        else {
            System.out.println("The file does not exist.");
        }
    }
}


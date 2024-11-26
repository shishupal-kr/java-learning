package Exceptionhandling;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filereading {
    public static void main(String[] args) {
        try {
            File mac = new File("spec.txt");
            Scanner reader = new Scanner(mac);

            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("something went wrong");
            e.printStackTrace();
        }
    }
}
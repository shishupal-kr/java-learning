package File_io;

import java.io.File;
import java.io.IOException;

public class filecreating{
    public static void main(String[] args) {

        try {
            File mac = new File("spec.txt");

            if (mac.createNewFile()) {
                System.out.println("file is created :" + mac.getName());
            } else {
                System.out.println("file already exist");
            }
        }
        catch (IOException e) {
            System.out.println("error occur");
            e.printStackTrace();
        }

    }
}

package Exceptionhandling;

import java.io.FileWriter;
import java.io.IOException;

    public class filewriting {
        public static void main(String[] args) {
            try {
                FileWriter mac = new FileWriter("spec.txt");

                mac.write("Model =Macbook Air, Processor = M2,storage= 256GB, Ram=8GB");
                mac.close();

                System.out.println("Data written Sucssfully");
            }
            catch (IOException e) {
                System.out.println("something went wrong");
                e.printStackTrace();
            }
        }
    }

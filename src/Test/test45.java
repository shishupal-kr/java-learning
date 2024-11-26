package Test;

import java.io.File;

public class test45 {
    public static void main(String[] args) {
        // Specify the path to the file
        File file = new File("/Users/shishupal/Dharampal/IMG_3699.mov");

        // Check if the file exists
        if (file.exists()) {
            // Get the size of the file in bytes
            long fileSizeInBytes = file.length();
            System.out.println("File size in bytes: " + fileSizeInBytes);

            // Convert to kilobytes (KB) or megabytes (MB)
            double fileSizeInKB = (double) fileSizeInBytes / 1024;
            double fileSizeInMB = fileSizeInKB / 1024;

            System.out.printf("File size in KB: %.2f\n", fileSizeInKB);
            System.out.printf("File size in MB: %.2f\n", fileSizeInMB);
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
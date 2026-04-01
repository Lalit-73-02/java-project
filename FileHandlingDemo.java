import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {

        try {
            // 🔹 1. Create File
            File file = new File("test.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }

            // 🔹 2. Write into File
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Hello Hanny!\nWelcome to Java File Handling.");
            writer.close();
            System.out.println("Data written successfully");

            // 🔹 3. Read File
            FileReader reader = new FileReader("test.txt");
            int ch;
            System.out.println("File content:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
} 
    

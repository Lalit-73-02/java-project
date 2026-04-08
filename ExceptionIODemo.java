import java.nio.file.*;
import java.io.IOException;
import java.util.List;

/**
 * Advanced Java: Exception Handling & NIO.2 Demo
 */

// Custom Exception Example
class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

public class ExceptionIODemo {
    private static final String FILE_PATH = "example_data.txt";

    public static void main(String[] args) {
        try {
            // 1. Using NIO.2 to Create and Write a file
            Path path = Paths.get(FILE_PATH);
            String content = "Hello Advanced Java!\nThis file was created using NIO.2.\nLine 3: Success.";
            
            Files.writeString(path, content);
            System.out.println("File created: " + path.toAbsolutePath());

            // 2. Reading a file using NIO.2
            List<String> lines = Files.readAllLines(path);
            System.out.println("\nFile Content:");
            lines.forEach(line -> System.out.println(" > " + line));

            // 3. Testing Custom Exception
            System.out.println("\nChecking data validity...");
            validateData(lines);

        } catch (IOException e) {
            System.err.println("File I/O Error: " + e.getMessage());
        } catch (InvalidDataException e) {
            System.err.println("Custom Validation Error: " + e.getMessage());
        } finally {
            System.out.println("\nCleanup: Operation finished.");
        }
    }

    /**
     * Demonstrates Custom Exception throwing
     */
    public static void validateData(List<String> lines) throws InvalidDataException {
        if (lines.isEmpty()) {
            throw new InvalidDataException("The file is empty! Validation failed.");
        }
        
        boolean hasSecret = lines.stream().anyMatch(l -> l.contains("Success"));
        if (!hasSecret) {
            throw new InvalidDataException("Missing required keyword 'Success'.");
        }
        
        System.out.println("Data is valid!");
    }
}

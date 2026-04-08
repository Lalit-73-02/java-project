import java.util.*;
import java.util.stream.*;

/**
 * Advanced Java: Lambda Expressions & Stream API (Java 8+)
 */

public class ModernJavaDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");

        // 1. Lambda Expressions
        // Old way (Anonymous Inner Class):
        // fruits.forEach(new Consumer<String>() { ... });
        
        // New way:
        System.out.println("Printing with Lambda:");
        fruits.forEach(f -> System.out.println(" - " + f));

        // 2. Stream API - Filter and Map
        System.out.println("\nFruits starting with 'B' or 'C' (Uppercase):");
        List<String> filtered = fruits.stream()
                .filter(f -> f.startsWith("B") || f.startsWith("C"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        
        System.out.println(filtered);

        // 3. Stream API - Numeric Operations
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        int sumOfEvens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n) // Square them first
                .sum();

        System.out.println("\nSum of squares of even numbers: " + sumOfEvens);

        // 4. Optional Class (Prevents NullPointerException)
        Optional<String> empty = Optional.empty();
        Optional<String> name = Optional.of("Antigravity");

        System.out.println("\nOptional Check:");
        System.out.println("Empty present? " + empty.isPresent());
        System.out.println("Name present? " + name.isPresent());
        System.out.println("Fallback value: " + empty.orElse("Unknown User"));
    }
}

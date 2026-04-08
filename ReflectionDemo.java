import java.lang.reflect.*;

/**
 * Advanced Java: Reflection API Demo
 */

class SecretAgent {
    private String name;
    private int experience;

    public SecretAgent(String name) {
        this.name = name;
        this.experience = 5;
    }

    private void confidentialMission() {
        System.out.println("Agent " + name + " is on a top-secret mission!");
    }

    public void publicReport() {
        System.out.println("Public Report: Everything is normal.");
    }
}

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            SecretAgent agent = new SecretAgent("Bond");

            // 1. Get the Class object
            Class<?> clazz = agent.getClass();
            System.out.println("Inspecting class: " + clazz.getName());

            // 2. List all methods (even private ones)
            System.out.println("\nMethods found:");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(" - " + m.getName() + " (Access: " + Modifier.toString(m.getModifiers()) + ")");
            }

            // 3. Access a PRIVATE field
            System.out.println("\nAttempting to read private field 'name'...");
            Field nameField = clazz.getDeclaredField("name");
            nameField.setAccessible(true); // MAGIC: Bypass private protection
            String value = (String) nameField.get(agent);
            System.out.println("Accessed Private Value: " + value);

            // 4. Invoke a PRIVATE method
            System.out.println("\nAttempting to call private method 'confidentialMission'...");
            Method secretMethod = clazz.getDeclaredMethod("confidentialMission");
            secretMethod.setAccessible(true);
            secretMethod.invoke(agent);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

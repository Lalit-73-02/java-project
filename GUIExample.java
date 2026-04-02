import javax.swing.*;

public class GUIExample {
    public static void main(String[] args) {

        // 🔹 JFrame Setup
        JFrame frame = new JFrame("My Application");
        frame.setSize(400, 400);
        frame.setLayout(null);   // manual layout
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 🔹 JLabel
        JLabel label = new JLabel("Which one is your favorite language?");
        label.setBounds(50, 20, 300, 30);
        frame.add(label);

        // 🔹 JCheckBox (Multiple selection)
        JCheckBox cb1 = new JCheckBox("C++");
        cb1.setBounds(50, 60, 100, 30);

        JCheckBox cb2 = new JCheckBox("Java");
        cb2.setBounds(150, 60, 100, 30);

        frame.add(cb1);
        frame.add(cb2);

        // 🔹 JRadioButton (Single selection)
        JRadioButton rb1 = new JRadioButton("Python");
        rb1.setBounds(50, 100, 100, 30);

        JRadioButton rb2 = new JRadioButton("JavaScript");
        rb2.setBounds(150, 100, 120, 30);

        // group banaya (sirf ek select ho)
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        frame.add(rb1);
        frame.add(rb2);

        // 🔹 JComboBox (Dropdown)
        String languages[] = {"C", "C++", "Java", "Python", "JavaScript"};
        JComboBox<String> combo = new JComboBox<>(languages);
        combo.setBounds(50, 150, 150, 30);
        frame.add(combo);

        // 🔹 Button (optional output)
        JButton btn = new JButton("Submit");
        btn.setBounds(50, 200, 100, 30);
        frame.add(btn);

        // 🔹 Show frame
        frame.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Backhand01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 450);
        frame.setLayout(new GridBagLayout());
        frame.getContentPane().setBackground(new Color(236, 240, 241));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // "Calculator" Title
        JLabel title = new JLabel("Calculator", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 22));
        title.setForeground(new Color(44, 62, 80));
        gbc.gridy = 0;
        frame.add(title, gbc);

        // Style helper for TextFields
        Font fieldFont = new Font("Segoe UI", Font.PLAIN, 16);

        // First Number Field
        JTextField num1Field = new JTextField("Enter First Number", 15);
        num1Field.setFont(fieldFont);
        num1Field.setPreferredSize(new Dimension(250, 40));
        gbc.gridy = 1;
        frame.add(num1Field, gbc);

        // Second Number Field
        JTextField num2Field = new JTextField("Enter Second Number", 15);
        num2Field.setFont(fieldFont);
        num2Field.setPreferredSize(new Dimension(250, 40));
        gbc.gridy = 2;
        frame.add(num2Field, gbc);

        // Result Field
        JTextField resultField = new JTextField(15);
        resultField.setFont(new Font("Segoe UI", Font.BOLD, 18));
        resultField.setPreferredSize(new Dimension(250, 45));
        resultField.setHorizontalAlignment(JTextField.CENTER);
        resultField.setBorder(BorderFactory.createLineBorder(new Color(52, 73, 94), 2));
        gbc.gridy = 3;
        frame.add(resultField, gbc);

        // "Add" Button
        JButton addButton = new JButton("Add");
        addButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        addButton.setBackground(Color.WHITE);
        addButton.setForeground(new Color(41, 128, 185)); // Professional blue
        addButton.setFocusPainted(false);
        addButton.setPreferredSize(new Dimension(200, 45));
        gbc.gridy = 4;
        frame.add(addButton, gbc);

        // Logic for Addition
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s1 = num1Field.getText().trim();
                    String s2 = num2Field.getText().trim();
                    
                    double n1 = Double.parseDouble(s1);
                    double n2 = Double.parseDouble(s2);
                    
                    double sum = n1 + n2;
                    resultField.setText(String.valueOf(sum));
                    resultField.setForeground(new Color(39, 174, 96)); // Green for success
                } catch (NumberFormatException ex) {
                    resultField.setText("Error: Invalid Input");
                    resultField.setForeground(Color.RED);
                }
            }
        });

        // Clear placeholder logic for num1Field
        num1Field.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (num1Field.getText().equals("Enter First Number")) {
                    num1Field.setText("");
                }
            }
        });

        // Clear placeholder logic for num2Field
        num2Field.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (num2Field.getText().equals("Enter Second Number")) {
                    num2Field.setText("");
                }
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

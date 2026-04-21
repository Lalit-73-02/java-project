// Standart application  -- core java - oop, input- output operation and exeption handling.
//  -- data conectivit -jdbc ,
//  database - oracal, Mysql, mongodb, postgresql, 
// Frameworks - Mavel, spring Boot, 



// web application
// Distributed application



import javax.swing.*;
import java.awt.*;

public class Backhand {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Java Server UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLayout(new GridBagLayout());
        frame.getContentPane().setBackground(new Color(236, 240, 241)); // Slightly nicer gray

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        gbc.gridx = 0;

        // "Enter Your Name" Label
        JLabel label = new JLabel("Enter Your Name");
        label.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label.setForeground(new Color(44, 62, 80));
        gbc.gridy = 0;
        frame.add(label, gbc);

        // Name Input Field
        JTextField textField = new JTextField("Hello Latif", 15);
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        textField.setPreferredSize(new Dimension(200, 40));
        textField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(189, 195, 199), 1),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        gbc.gridy = 1;
        frame.add(textField, gbc);

        // "send to server" Button
        JButton button = new JButton("send to server");
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setForeground(new Color(231, 76, 60)); // Beautiful red
        button.setBackground(Color.WHITE);
        button.setFocusPainted(false);
        button.setPreferredSize(new Dimension(180, 40));
        button.setBorder(BorderFactory.createLineBorder(new Color(189, 195, 199), 1));
        
        // Hover effect for button
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(245, 245, 245));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(Color.WHITE);
            }
        });

        gbc.gridy = 2;
        frame.add(button, gbc);

        // Center the frame on screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

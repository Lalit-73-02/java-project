import java.util.Scanner;

import javax.swing.*;

public class swingja {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        
        JLabel l1 = new JLabel("Each one is your favorate language");
        l1.setBounds(50, 50, 300, 30);
        frame.add(l1);

        String data[] = { "C", "C++", "Java" };
        // Yahan <String> add kiya hai warning hatane ke liye
        JComboBox<String> cb1 = new JComboBox<>(data);
        cb1.setBounds(100, 100, 100, 30);
        frame.add(cb1);

        // JCheckBox c1 = new JCheckBox("C");
        // c1.setBounds(100, 100, 100, 30);
        // frame.add(c1);
        // JCheckBox c2 = new JCheckBox("C++");
        // c2.setBounds(100, 150, 100, 30);
        // frame.add(c2);
        // JCheckBox c3 = new JCheckBox("Java");
        // c3.setBounds(100, 200, 100, 30);
        // frame.add(c3);

        // JRadioButton r1 = new JRadioButton("C");
        // r1.setBounds(100, 100, 100, 30);
        // frame.add(r1);
        // JRadioButton r2 = new JRadioButton("C++");
        // r2.setBounds(100, 150, 100, 30);
        // frame.add(r2);
        // JRadioButton r3 = new JRadioButton("Java");
        // r3.setBounds(100, 200, 100, 30);
        // frame.add(r3);

      

        // String column[] = {"Id","Name","Salary"};
        // String data01[][] = {
        // {"1","John","50000"},
        // {"2","Jane","60000"},
        // {"3","Bob","70000"}
        // };
        // JTable tb1 = new JTable(data01,column);
        // tb1.setBounds(30,50,300,200);
        // frame.add(tb1);

        // JCheckBox c10 = new JCheckBox("C");
        // JCheckBox c20 = new JCheckBox("C++");
        // JCheckBox c30 = new JCheckBox("Java");
        // c10.setBounds(100, 100, 100, 30);
        // c20.setBounds(100, 150, 100, 30);
        // c30.setBounds(100, 200, 100, 30);
        // frame.add(c1);
        // frame.add(c2);
        // frame.add(c3);

        // JTextField t1 = new JTextField("Enter your name");
        // t1.setBounds(100, 100, 100, 30);
        // JPasswordField p1 = new JPasswordField();
        // p1.setBounds(100, 150, 100, 30);
        // JTextArea ta1 = new JTextArea();
        // ta1.setBounds(100, 200, 100, 60);
        // frame.add(ta1);
        // frame.add(p1);
        // frame.add(t1);

        // JLabel l0 = new JLabel("hello");
        // l0.setBounds(120,65,100,30);
        // frame.add(l0);

        // JButton b1 = new JButton(new
        // ImageIcon("C:\\Users\\Asus\\Downloads\\image.jpg"));
        // b1.setBounds(120,100,100,50);
        // //Label

        // // Button pe click hone par kya hoga, wo yahan define kiya hai:
        // b1.addActionListener(e -> {
        // System.out.println("Button Clicked!");
        // JOptionPane.showMessageDialog(frame, "Hello! Button is working");
        // });

        // frame.add(b1);

        // // Sab kuch add karne ke baad visible karna chahiye
        // frame.setVisible(true);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// import java.awt.*;
// import java.awt.event.*; // Window closing handle karne ke liye

// public class swingja {
// public static void main(String[] args) {
// // JFrame ki jagah Frame use hota hai
// Frame frame = new Frame("AWT Example");

// frame.setSize(500, 500);
// frame.setLayout(null);
// frame.setVisible(true);

// // AWT mein window close button kaam nahi karta default mein,
// // isliye ye listener add karna zaroori hai:
// frame.addWindowListener(new WindowAdapter() {
// public void windowClosing(WindowEvent e) {
// System.exit(0);
// }
// });
// }
// }

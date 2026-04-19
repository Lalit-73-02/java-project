import java.util.Scanner;
import javax.swing.*;

public class menu {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JMenuBar mb = new JMenuBar();
        JMenu menu, submenu;
        JMenuItem i1, i2, i3, i4, i5;
        menu = new JMenu("File");
        submenu = new JMenu("Sub Menu");
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Cut");
        i5 = new JMenuItem("Copy");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);


        // JMenu m1 = new JMenu("File");
        // JMenu m2 = new JMenu("Edit");
        // JMenu m3 = new JMenu("Help");
        // JMenuItem i1 = new JMenuItem("New");
        // JMenuItem i2 = new JMenuItem("Open");
        // JMenuItem i3 = new JMenuItem("Save");
        // JMenuItem i4 = new JMenuItem("Exit");
        // m1.add(i1);
        // m1.add(i2);
        // m1.add(i3);
        // m1.add(i4);
        // mb.add(m1);
        // mb.add(m2);
        // mb.add(m3);
        // f.setJMenuBar(mb);
        // f.setSize(400, 400);
        // f.setVisible(true);
    }
}
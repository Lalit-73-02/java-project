import java.util.Scanner;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;;

public class Main {

    public static void main(String[] args) {
        JFrame f = new JFrame("Main");
        f.setSize(400,400);
        f.setVisible(true);

        DefaultMutableTreeNode style= new DefaultMutableTreeNode("style");
        DefaultMutableTreeNode color= new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode font= new DefaultMutableTreeNode("font");
        
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red= new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode green= new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode blue= new DefaultMutableTreeNode("Blue");
        color.add(red);
        color.add(green);
        color.add(blue);
        JTree t= new JTree(style);
        f.add(t);
       
    }
}
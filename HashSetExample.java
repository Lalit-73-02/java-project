// Duplicate values not allow 
// Unique elements store 
//  in Java HashSet is a  collection that is store only Unique Elements 
// (alag-alag values) to  store karne ke liye use hoti hai.
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        System.out.println("Set Element: " +set);
    }
}


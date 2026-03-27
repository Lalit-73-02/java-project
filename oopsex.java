abstract class Animal {   // Abstraction
    abstract void sound();

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {   // Inheritance

    private int age;   // Encapsulation (data hiding)

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Polymorphism (Method Overriding)
    void sound() {
        System.out.println("Dog barks");
    }
}

public class oopsex {
    public static void main(String[] args) {

        Dog d = new Dog();

        // Encapsulation use
        d.setAge(5);
        System.out.println("Dog Age: " + d.getAge());

        // Inherited method
        d.eat();

        // Polymorphism
        Animal a = new Dog();
        a.sound();
    }
}
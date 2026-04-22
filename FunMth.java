// Fuction call
// public class FunMth {
//     public static void name(){
//         System.out.println("Lalit");
//     }
//     public static void main(String[] args) {
//         name();
//     }
// }


// public class FunMth{
//     static void sayHello(String n){
//         String name = n;
//         System.out.print("Hello Bhai " + name);
//     }
//     public static void main(String[] args) {
//         sayHello("Lalit");
//     }
// }

// import java.util.Scanner;
// public class FunMth{
//     static int sum(int X, int Y){
//         return X + Y;
//     }
//     public static void main(String[] args) {
//         int a ;
//         int b;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of a : ");
//         a = sc.nextInt();
//         System.out.print("Enter the value of b : ");
//         b = sc.nextInt();
//         System.out.print("The sum of a and b is : " + sum(a, b));
//     }
// }

// import java.util.Scanner;

// public class FunMth {
//     static boolean ifEven(int n){
//         if(n % 2 == 0){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         int a;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of a : ");
//         a = sc.nextInt();
//         System.out.print(ifEven(a));
//     }
// }









// Classes and Object
// public class FunMth{
//     public static class Main{
//         String name;
//         int age;
//     }
//     public static void main(String[] args) {
//         Main obj = new Main();
//         obj.name = "Lalit";
//         obj.age = 20;
//         System.out.print("Name : " + obj.name + "\n");
//         System.out.print("Age : " + obj.age + "\n");
//     }
// }









// import java.util.Scanner;
// public class FunMth{
//     static class Student{
//         String name;
//         int age;
//         void input(String n, int a){
//             name = n;
//             age = a;
//         }
//         void output(){
//             System.out.print("Name : " + name + "\n");
//             System.out.print("Age : " + age + "\n");
//         }
//     }
//     public static void main(String[] args) {
//         Student obj = new Student();
//         obj.input("Lalit", 20);
//         obj.output();
//     }
// }









// constructor
//default constructor
// public class FunMth{
//     static class person{
//         String name;
//         int age;
//         void output(){
//             System.out.print("Name :" + name + "\n" );
//             System.out.print("Age :" + age + "\n" );
//         }
//     }

//     public static void main(String[] args) {
//         person person1 = new person();
//         person1.output();


//     }
// }







//paramitrise constructor
// public class FunMth{
//     static class person{
//         String name;
//         int age;

//         void input(String n, int a){
//             name = n;
//             age = a;
//         }
//         void output(){
//             System.out.print("Name :" + name + "\n" );
//             System.out.print("Age :" + age + "\n" );
//         }
//     }

//     public static void main(String[] args) {
//         person person1 = new person();
//         person1.input("Lalit", 25);
//         person1.output();

//     }
// }


// non paramitrise constructor
// public class FunMth{
//     static class person{
//         String name;
//         int age;
//         person(){
//             name = "Lalit";
//             age = 25;
//         }
//         void output(){
//             System.out.print("Name :" + name + "\n" );
//             System.out.print("Age :" + age + "\n" );
//         }
//     }
//     public static void main(String[] args) {
//         person person1 = new person();
//         person1.output();

//     }
// }




// public class FunMth{
//     static class person{
//         String name;
//         int age;
//         person(String name, int age){
//             this.name = name;
//             this.age = age;
//         }
//  // this mean name is class variable and is persion input(name) value this is only method

//         void output(){
//             System.out.print("Name :" + name + "\n" );
//             System.out.print("Age :" + age + "\n" );
//         }
//     }
//     public static void main(String[] args) {
//         person person1 = new person("this is use of this ", 25);
//         person1.output();

//     }
// }







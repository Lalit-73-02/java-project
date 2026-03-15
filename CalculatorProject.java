import java.util.Scanner;

public class CalculatorProject {
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }
    static int mod(int a, int b){
        return a%b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n--- Simple calculation ----");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Div");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4){
                System.out.print("Enter first number: ");
                int num1 = sc.nextInt();

                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Result =" + add(num1, num2));
                        break;
                    
                        case 2:
                        System.out.println("Result =  " + sub(num1, num2));
                        break;

                    case 3:
                        System.out.println("Result =  " + mul(num1, num2));
                        break;

                    case 4:
                        System.out.println("Result =  " + div(num1, num2));
                        break;
                }
            }
            
        }while(choice != 5);

        System.out.println("Program Ended");
        sc.close();
    }
}

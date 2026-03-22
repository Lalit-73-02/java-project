// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number: ");
//         int num = sc.nextInt();

//         if (num % 2 == 0) {
//             System.out.println("Even Number");
//         } else {
//             System.out.println("Odd Number");
//         }
//     }
// }



// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number: ");
//         int num = sc.nextInt();

//         int fact = 1;

//         for (int i = 1; i <= num; i++) {
//             fact = fact * i;
//         }

//         System.out.println("Factorial = " + fact);
//     }
// }

// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number: ");
//         int num = sc.nextInt();

//         boolean isPrime = true;

//         for (int i = 2; i < num; i++) {
//             if (num % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }

//         if (num <= 1) {
//             System.out.println("Not Prime");
//         } else if (isPrime) {
//             System.out.println("Prime Number");
//         } else {
//             System.out.println("Not Prime");
//         }
//     }
// }

// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number: ");
//         int num = sc.nextInt();

//         int rev = 0;

//         while (num != 0) {
//             int digit = num % 10;
//             rev = rev * 10 + digit;
//             num = num / 10;
//         }

//         System.out.println("Reversed Number = " + rev);
//     }
// }


// Fibonacci Series
// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of terms: ");
//         int n = sc.nextInt();

//         int a = 0, b = 1;

//         System.out.print("Fibonacci Series: ");

//         for (int i = 1; i <= n; i++) {
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//         }
//     }
// }


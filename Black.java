public class Black {
    public static void main(String[] args) {
        String var = "abbcccdddd";
       
        for(int i = 0; i < var.length(); i++){
          char ch = var.charAt(i);
          
          // Skip if we already counted this character earlier in the string
          if (var.indexOf(ch) < i) {
              continue;
          }
          
          int count = 0;

          for(int j = 0; j < var.length(); j++){
            if(ch == var.charAt(j)){
                count++;
            }
          }
          System.out.println( "total count of " + ch + " is " + count);
        }
       
    }
}

























// import java.util.Arrays;                 //ANAGRAM
// public class Black {
//     public static void main(String[] args) {
//     String s1 = "listen";
//     String s2 = "silent";

//     char a[] = s1.toCharArray();
//     char b[] = s2.toCharArray();

//     Arrays.sort(a);
//     Arrays.sort(b);

//     if(Arrays.equals(a,b)){
//         System.out.print("Anagram");
//     }
//     else
//         System.out.print("NOt Anagram");

//     }
// }









    //     int arr[] = {10,20,30,40,50};            //SECOND LARGEST ELEMENT

    //    int max = Integer.MIN_VALUE;
    //    int second = Integer.MIN_VALUE;

    //     for(int i = 0; i<arr.length; i++){
    //         if(arr[i]>max){
    //             second = max;
    //             max = arr[i];
    //         }
    //         else if(arr[i]>second && arr[i]!=max){
    //             second = arr[i];
    //         }
    //     }
    //     System.out.println("Largest element is: " + max);
    //     System.out.println("Second largest element is: " + second);








        //     for(int i = 2; i<=100; i++){           //PRIME NUMBERS
        //    boolean isprime = true;

        //    for(int j = 2; j <= Math.sqrt(i); j++){
        //     if(i%j == 0){
        //         isprime = false;
        //         break;
        //     }
        //    }
        //    if(isprime){
        //     System.out.println(i + "is a prime number");
        //    }
        // }




    // int a = 0, b = 1;         //FIBONACCI SERIES
    //     System.out.print(a + " " +b+ " ");
    //     for(int i = 2; i<=10; i++){
    //         int c = a + b;
    //         System.out.print(c + " ");
    //         a = b;
    //         b = c;
    //     }




    //    String s1 = "Lalitsinghkanyal";
    //     String rev = ""; 
    //     for(int i = s1.length() - 1; i >= 0; i--){
    //         rev = rev + s1.charAt(i); 
    //     }
        
    //     System.out.println(rev);






//     public class Black {               //PRINTING PATTERN
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("x");
//             }
//             System.out.println();
//         }
//     }
// }




        // for(int i = 1; i <= 4; i++){             //PATTERN
        //     for(int j = 1; j <= 4; j++){
        //         // Print "x" for row 1, row 4, column 2, and column 3
        //         if(i == 1 || i == 4 || j == 2 || j == 3){
        //             System.out.print("x ");
        //         }
        //         else {
        //             // Print blank spaces for the rest
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }




        //         for(int i = 1; i <= 4; i++){
        //     for(int j = 1; j <= 4; j++){
        //         // Print "x" for row 1, row 4, column 1, and column 4
        //         if(i == 1 || i == 4 || j == 1 || j == 4){
        //             System.out.print("x ");
        //         }
        //         else {
        //             // Print blank spaces for the rest
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }




       
        // for( int i = 1; i <= 4; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // for( int i = 1; i <= 4; i++){
        //     for(int j = 4; j >= i; j--){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }








    //   int arr[] = {1,2,2,3,4,4};
      
    //    for( int i = 0; i < arr.length; i++){
    //     boolean isDuplicate = false;
    //     for(int j = 0; j < i; j++){
    //         if(arr[i] == arr[j]){
    //             isDuplicate = true;
    //         }
    //     }
    //     if(isDuplicate){
    //         System.out.println(arr[i] + " is a duplicate ");
    //     }
    //    }        
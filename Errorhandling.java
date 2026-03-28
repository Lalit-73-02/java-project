class Errorhandling{
    public static void main(String[] args) {
        
        try {
            int a = 10;
            int b = 0;
            
            int result = a / b; // error
            
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); // error
            
        } catch (ArithmeticException e) {
            System.out.println("❌ Divide by zero error");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Array index error");
            
        } catch (Exception e) {
            System.out.println("❌ General error");
            
        } finally {
            System.out.println("✅ Program finished");
        }
    }
}
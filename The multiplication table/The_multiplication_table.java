public class The_multiplication_table {
    public static void main(String[] args) {
        
        System.out.println("Java - The Multiplication Table");
        // First for loop, Example 1 x 
        for (int i = 1; i<=10; i++) {
           // Second For loop, Example x 1
            for (int y = 1; y<=10; y++) {
               int sonuc = i*y;
               System.out.println(i + " x " + y + " = "+ (sonuc));  
           }
         System.out.println("------------------------------");
        }
    }}
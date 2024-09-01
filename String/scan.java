import java.util.Scanner;

class Scan {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int length = 5;
        String arr[] = new String[length];

        Scanner sc = new Scanner(System.in);
        
        // Loop to input strings
        for (int i = 0; i < length; i++) {
            System.out.print("Enter string: ");
            arr[i] = sc.nextLine();
        }
 
        System.out.println("\nEntered strings are:");
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
        
        // Close the Scanner
        sc.close();
    }
}

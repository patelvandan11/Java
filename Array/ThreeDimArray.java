import java.util.Scanner;

class ThreeDimArray {
    public static void main(String[] args) {
        int v[][][] = new int[3][3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("Enter value for v[" + i + "][" + j + "][" + k + "]: ");
                    v[i][j][k] = scanner.nextInt();
                }
            }
        }

        // Print the array
        System.out.println("Array values:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println("v[" + i + "][" + j + "][" + k + "] = " + v[i][j][k]);
                }
            }
        }

        scanner.close();
    }
}

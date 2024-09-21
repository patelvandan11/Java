import java.util.Scanner;

class ValueException extends Exception {
    ValueException(String m) {
        super(m);
    }
}
class ZeroException extends Exception {
    ZeroException(String m) {
        super(m);
    }
}

public class P7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            if (n == 0) {
                throw new ZeroException("Number of elements cannot be zero.");
            }

            int[] array = new int[n];
            System.out.println("Enter " + n + " positive integers:");

            for (int i = 0; i < n; i++) {
                int value = scanner.nextInt();
                if (value < 0) {
                    throw new ValueException("Negative values are not allowed.");
                }
                array[i] = value;
            }

            double average = calculateAverage(array);
            System.out.println("The average is: " + average);

        } catch (ValueException | ZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }
}

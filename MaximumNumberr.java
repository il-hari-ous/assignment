import java.util.Scanner;

public class MaximumNumberr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxNumber = numbers[0]; // Assume the first element as the maximum
        int maxIndex = 0; // Position/Index of the maximum number

        for (int i = 1; i < n; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println("Maximum number: " + maxNumber);
        System.out.println("Position/Index: " + maxIndex);

        scanner.close();
    }
}

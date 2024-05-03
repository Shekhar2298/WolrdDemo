import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int n = arr.length;
        int max = arr[n - 1];
        int secondMax = arr[0];

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < max) {
                secondMax = arr[i];
                break;
            }
        }

        
        if (secondMax == max) {
            for (int i = n - 3; i >= 0; i--) {
                if (arr[i] < max) {
                    secondMax = arr[i];
                    break;
                }
            }
        }

        if (secondMax != arr[0]) {
            System.out.println("Second-highest element: " + secondMax);
        } else {
            System.out.println("Second highest element "+ secondMax);
        }

        scanner.close();
    }
}

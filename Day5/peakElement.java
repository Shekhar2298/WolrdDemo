import java.util.Scanner;

public class peakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n]; 

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Stored array:");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println(); 

        System.out.println("Peak elements:");
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                System.out.println(a[i]);
            }
        }
    }
}

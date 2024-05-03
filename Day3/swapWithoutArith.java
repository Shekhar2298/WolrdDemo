import java.util.Scanner;

public class swapWithoutArith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("value of a: ");
        int a = scanner.nextInt();

        System.out.print("value of b: ");
        int b = scanner.nextInt();

        System.out.println("\nBefore swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

     
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();
    }
}

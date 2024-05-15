package Day9;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        System.out.println("Factorial of " + number + " is: " + factorial(number));
        scanner.close();
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

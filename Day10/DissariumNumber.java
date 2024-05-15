package Day9;

import java.util.Scanner;

public class DissariumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Dissarium number: ");
        int number = scanner.nextInt();
        if (isDissarium(number)) {
            System.out.println(number + " is a Dissarium number.");
        } else {
            System.out.println(number + " is not a Dissarium number.");
        }
        scanner.close();
    }

    public static boolean isDissarium(int num) {
        int originalNumber = num;
        int sum = 0;
        int numberOfDigits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            numberOfDigits--;
            num /= 10;
        }
        return sum == originalNumber;
    }
}


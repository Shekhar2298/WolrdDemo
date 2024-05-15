package Day9;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println("Enter year:");
        Scanner sc = new Scanner(System.in);
        int yr = sc.nextInt();
        if ((yr % 4 == 0) && (yr % 100 != 0 || yr % 400 == 0)) {
            System.out.println("It's a leap year");
        } else {
            System.out.println("It's not a leap year");
        }
    }
}

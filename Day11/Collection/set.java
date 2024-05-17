package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> uniqueNames = new HashSet<>();

        System.out.println("Enter names (type 'exit' to stop):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            uniqueNames.add(name);
        }

        System.out.println("Unique names are:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}

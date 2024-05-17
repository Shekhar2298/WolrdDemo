package Map;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> nameToAge = new HashMap<>();

        System.out.println("Enter name and age pairs (type 'exit' to stop):");
        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // consume the remaining newline
            nameToAge.put(name, age);
        }

        System.out.println("Names and ages are:");
        for (Map.Entry<String, Integer> entry : nameToAge.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }

        scanner.close();
    }
}


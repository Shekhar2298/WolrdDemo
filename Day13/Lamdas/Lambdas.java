package Lamdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(1, "shri", 20),
                new Person(2, "shri2", 15),
                new Person(3, "shri3", 23)
        );

        List<Integer> ages = people.stream()
                .map(Person::getAge)
                .collect(Collectors.toList());
        ages.forEach(System.out::println);
        System.out.println();

        List<Integer> agesPlusTwo = people.stream()
                .map(person -> person.getAge() + 2)
                .collect(Collectors.toList());
        agesPlusTwo.forEach(System.out::println);
        System.out.println();

        List<Person> filteredList = people.stream()
                .filter(person -> person.getAge() > 18)
                .collect(Collectors.toList());
        filteredList.forEach(System.out::println);
        System.out.println();

        int totalAge = people.stream()
                .map(Person::getAge)
                .reduce(0, Integer::sum);
        System.out.println("Total age: " + totalAge);
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println();

        ages.forEach(n -> {
            if (n % 10 == 0) {
                System.out.println(n);
            }
        });
    }
}

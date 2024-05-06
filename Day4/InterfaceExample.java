package Day4;

interface Animal {
    void sound(); 
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        
        Cat cat = new Cat();
        cat.sound(); 
    }
}

package PracticeSet01;

public class Animal {
    void makeSound() {
        System.out.println("bark");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        a.makeSound();
        c.makeSound();
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("meow");
    }
}
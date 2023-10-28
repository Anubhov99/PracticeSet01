package PracticeSet01;

public class Animal {
    void makeSound() {
        System.out.println("bark");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("mew");
    }
}
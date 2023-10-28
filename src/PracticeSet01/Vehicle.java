package PracticeSet01;

public class Vehicle {
    public void drive(){
        System.out.println("Vroom vroom");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        v.drive();
        c.drive();
    }
}
class Car extends Vehicle{
    public void drive()
    {
        System.out.println("Repairing a car");
    }
}

package PracticeSet01;

public class Student {

    String name;

    Student(String n){
        this.name=n;
        System.out.println(n);
    }

    Student(){
        System.out.println("Unknown");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Anwesha");
        Student s2 = new Student();
    }


}

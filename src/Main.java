// Create a class
class Person {

    // Data members (variables)
    String name;
    int age;

    // Method (function)
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create object of Person class
        Person p1 = new Person();

        // Assign values
        p1.name = "Sarthak";
        p1.age = 22;

        // Call method
        p1.displayInfo();
    }
}

// ---------------------- Employee Class -------------------------
class Employee {
    private int salary;
    private String name;

    // Constructor (optional)
    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// ---------------------- Cellphone Class -------------------------
class Cellphone {

    void ring() {
        System.out.println("Ringing...");
    }

    void vibrate() {
        System.out.println("Vibrating...");
    }

    void callFriend() {
        System.out.println("Calling friend...");
    }
}

// ---------------------- Book Class -------------------------
class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        System.out.println("\nDefault Constructor:");
        System.out.println(title + " | " + author + " | " + price);
    }

    // Constructor with title and author only
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
        System.out.println("\nConstructor (Title & Author):");
        System.out.println(title + " | " + author + " | " + price);
    }

    // Constructor with all values
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("\nConstructor (All Fields):");
        System.out.println(title + " | " + author + " | " + price);
    }
}

// ---------------------- Main Class -------------------------
public class Main {
    public static void main(String[] args) {

        System.out.println("---- Employee Test ----");
        Employee emp = new Employee(50000, "John");
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Name: " + emp.getName());
        emp.setName("David");
        System.out.println("Updated Name: " + emp.getName());

        System.out.println("\n---- Cellphone Test ----");
        Cellphone phone = new Cellphone();
        phone.ring();
        phone.vibrate();
        phone.callFriend();

        System.out.println("\n---- Book Constructors Test ----");
        Book b1 = new Book();
        Book b2 = new Book("Java Fundamentals", "James Gosling");
        Book b3 = new Book("Effective Java", "Joshua Bloch", 45.99);

        System.out.println("\nAll tests completed successfully!");
    }
}
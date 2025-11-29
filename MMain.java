class Cylinder {
    private double radius;
    private double height;

    // Getters
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Surface Area = 2πr(h + r)
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }

    // Volume = πr²h
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

// ----------------------------------------------------------

class Cylinder2 {
    private double radius;
    private double height;

    // Constructor
    public Cylinder2(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

// ----------------------------------------------------------

class Rectangle {
    private int length;
    private int breadth;

    // Default constructor (4, 5)
    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    // Overloaded constructor (custom values)
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }
}

// ----------------------------------------------------------

public class MMain {
    public static void main(String[] args) {

        System.out.println("---- Using Setters (Cylinder) ----");
        Cylinder c = new Cylinder();
        c.setRadius(7);
        c.setHeight(10);
        System.out.println("Surface Area: " + c.getSurfaceArea());
        System.out.println("Volume: " + c.getVolume());

        System.out.println("\n---- Using Constructor (Cylinder2) ----");
        Cylinder2 c2 = new Cylinder2(7, 10);
        System.out.println("Surface Area: " + c2.getSurfaceArea());
        System.out.println("Volume: " + c2.getVolume());

        System.out.println("\n---- Rectangle Default Constructor ----");
        Rectangle r1 = new Rectangle();
        System.out.println("Area (4x5): " + r1.getArea());

        System.out.println("\n---- Rectangle Overloaded Constructor ----");
        Rectangle r2 = new Rectangle(8, 12);
        System.out.println("Area (8x12): " + r2.getArea());
    }
}


import java.util.Scanner;

class Box {
    double length;
    double width;
    double height;

    // Constructor
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    // Method to calculate volume
    double volume() {
        return length * width * height;
    }
}

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        // Create Box object
        Box b = new Box(length, width, height);

        // Print volume
        System.out.println("Volume of the box = " + b.volume());

        sc.close();
    }
}

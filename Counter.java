import java.util.Scanner;

class Counter1 {
    static int count = 0;   // static variable shared by all objects

    Counter1() {
        count++;           // increase when object is created
    }

    static int getCount() {
        return count;
    }
}

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of objects to create: ");
        int n = sc.nextInt();

        // Create n objects of Counter class
        for (int i = 0; i < n; i++) {
            new Counter();
        }

        // Display total objects created
        System.out.println("Number of objects created: " + Counter.getCount());

        sc.close();
    }
}

class SubtractOperation {

// subtract two integers
int subtract(int a, int b) {
    return a - b;
}

// subtract three integers
int subtract(int a, int b, int c) {
    return a - b - c;
}

// subtract two double values
double subtract(double a, double b) {
    return a - b;
}

// subtract integer from double
double subtract(double a, int b) {
    return a - b;
}

// subtract double from integer
double subtract(int a, double b) {
    return a - b;
}
}

public class substract {
    public static void main(String[] args) {
        SubtractOperation obj = new SubtractOperation();

        System.out.println("Subtract(10, 5) = " + obj.subtract(10, 5));
        System.out.println("Subtract(20, 5, 3) = " + obj.subtract(20, 5, 3));
        System.out.println("Subtract(10.5, 4.2) = " + obj.subtract(10.5, 4.2));
        System.out.println("Subtract(15.5, 5) = " + obj.subtract(15.5, 5));
        System.out.println("Subtract(12, 3.5) = " + obj.subtract(12, 3.5));
    }
}
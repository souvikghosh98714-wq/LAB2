import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.println("\nEnter details of student " + (i + 1));
            System.out.print("Roll No: ");
            s[i].roll = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Name: ");
            s[i].name = sc.nextLine();

            System.out.print("CGPA: ");
            s[i].cgpa = sc.nextDouble();
        }

        // Display all student details
        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Roll: " + s[i].roll + ", Name: " + s[i].name + ", CGPA: " + s[i].cgpa);
        }

        // Find student with lowest CGPA
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < s[minIndex].cgpa) {
                minIndex = i;
            }
        }

        // Display student with lowest CGPA
        System.out.println("\nStudent with Lowest CGPA:");
        System.out.println("Roll: " + s[minIndex].roll);
        System.out.println("Name: " + s[minIndex].name);
        System.out.println("CGPA: " + s[minIndex].cgpa);

        sc.close();
    }
}

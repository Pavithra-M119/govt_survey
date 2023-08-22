import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create a database to store the information.
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        double salary;
        // Create a web form that people can use to submit their information.
        System.out.println("enter your name:");
        name = input.next();
        System.out.println("enter your age:");
        age = input.nextInt();
        System.out.println("enter your salary:");
        salary = input.nextDouble();
        // Validate the input to make sure that no negative values are being accepted for age and salary.
        if (age < 0 || salary < 0) {
            System.out.println("Error: Negative values are not allowed.");
            return;
        }
    }
}
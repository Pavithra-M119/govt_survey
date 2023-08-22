import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create a database to store the information.
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        double salary;
        // information of people
        System.out.println("enter your name:");
        name = input.next();
        System.out.println("enter your age:");
        age = input.nextInt();
        System.out.println("enter your salary:");
        salary = input.nextDouble();
        // checking for negative values
        if (age < 0 || salary < 0) {
            System.out.println("Error: Negative values are not allowed.");
            return;
        }
        else
        {
            System.out.println("Citizens informations are: "+name+" "+age+" "+salary);
        }
    }
}
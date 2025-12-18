//1.	To find the age of Harry
import java.util.Scanner;

public class AgeHarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        int age = 2024 - birthYear;

        System.out.println("Your age is "  + age);
        sc.close();
    }
}

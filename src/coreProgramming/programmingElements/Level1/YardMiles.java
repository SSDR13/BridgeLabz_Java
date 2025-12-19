package coreProgramming.programmingElements.Level1;//14.	To find the distance in yards and miles

import java.util.*;
public class YardMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance (in feet): ");
        double feet = sc.nextDouble();
        double yards = feet / 3.0;
        double miles = yards / 1760;

        System.out.printf("The distance in foot is %.1f \nYards: %.2f \t Miles: %.2f", feet, yards, miles);
        sc.close();
    }
}

//8.	To convert distance in kilometers to miles (User input)

import java.util.Scanner;
public class DistKm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInKms =  sc.nextDouble();
        double distanceInMiles = distanceInKms * 0.621371;

        System.out.printf("The total miles is %.2f mile for the given %.1fkm", distanceInMiles, distanceInKms);
    }
}

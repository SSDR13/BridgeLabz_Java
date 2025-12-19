package coreProgramming.programmingElements.Level2;//4.	Temperature Conversion from Celsius to Fahrenheit
import java.util.*;
public class CellToFar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature (in °C): ");
        double celsius = sc.nextDouble();
        double fahrenheitResult = (celsius * 9/5) + 32;

        System.out.printf("The %.1f celsius is %.2f fahrenheit", celsius, fahrenheitResult);

        sc.close();
    }
}

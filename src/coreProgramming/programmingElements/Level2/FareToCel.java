//5.	Temperature Conversion from Fahrenheit to Celsius

import java.util.*;
public class FareToCel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature (in °F): ");
        double fahrenheit = sc.nextDouble();
        double celsiusResult = (fahrenheit - 32) * (5/9.0);

        System.out.printf("The %.1f fahrenheit is %.2f celsius", fahrenheit, celsiusResult);
        sc.close();
    }
}


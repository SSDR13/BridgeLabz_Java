//7.	Create a program to swap two numbers

import java.util.*;
public class SwapTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.printf("The swapped numbers are %d and %d", number1, number2);
        sc.close();
    }
}

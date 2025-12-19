package coreProgramming.controlFlow.Level3;//2. Leap Year program using a single if condition with logical operators

import java.util.Scanner;
class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            System.out.println("Year is a Leap Year");
        else
            System.out.println("Year is not a Leap Year");
    }
}
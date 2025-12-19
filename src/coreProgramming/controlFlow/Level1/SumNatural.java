package coreProgramming.controlFlow.Level1;//4. Write a program to check for the natural number and find the sum

import java.util.Scanner;
class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}

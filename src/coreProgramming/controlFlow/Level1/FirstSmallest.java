package coreProgramming.controlFlow.Level1;//2. Write a program to check if the first is the smallest of the 3 numbers

import java.util.Scanner;
class FirstSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Is the first number the smallest? " + (a < b && a < c));
    }
}
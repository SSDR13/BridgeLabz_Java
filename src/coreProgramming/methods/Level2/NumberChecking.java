package coreProgramming.methods.Level2;

import java.util.Scanner;

public class NumberChecking {
    public static boolean isPositive(int n) { return n > 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) { return a > b ? 1 : (a < b ? -1 : 0); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int n : arr) {
            if (isPositive(n)) System.out.println(n + " is positive and " + (isEven(n) ? "even" : "odd"));
            else System.out.println(n + " is negative");
        }

        int cmp = compare(arr[0], arr[4]);
        System.out.println("Comparison of first and last: " + (cmp == 1 ? "greater" : (cmp == -1 ? "less" : "equal")));
    }
}

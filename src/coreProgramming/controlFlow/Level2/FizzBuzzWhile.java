package coreProgramming.controlFlow.Level2;//5. coreProgramming.arrays.Level1.FizzBuzz using while loop

import java.util.Scanner;
class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        if (n > 0) {
            while (i <= n) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("coreProgramming.arrays.Level1.FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
                i++;
            }
        }
    }
}
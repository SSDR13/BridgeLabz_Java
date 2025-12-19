package coreProgramming.controlFlow.Level2;//1. Print odd and even numbers between 1 to the number entered

import java.util.Scanner;
class OddEvenLevel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is even");
                else
                    System.out.println(i + " is odd");
            }
        }
    }
}

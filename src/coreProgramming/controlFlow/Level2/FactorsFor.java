package coreProgramming.controlFlow.Level2;//7. Find factors of a number using for loop

import java.util.Scanner;
class FactorsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                    System.out.println(i);
            }
        }
    }
}
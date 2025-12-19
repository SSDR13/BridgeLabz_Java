package coreProgramming.controlFlow.Level2;//12. Find the power of a number using for loop

import java.util.Scanner;
class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        int result = 1;
        if (number > 0 && power >= 0) {
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(result);
        }
    }
}
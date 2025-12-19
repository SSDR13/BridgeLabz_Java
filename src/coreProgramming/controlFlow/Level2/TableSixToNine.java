package coreProgramming.controlFlow.Level2;//3. Multiplication table of a number from 6 to 9

import java.util.Scanner;
class TableSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
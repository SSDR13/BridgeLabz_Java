package coreprogramming.programmingelements.level2;

import java.util.Scanner;
public class TotInc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter your coreProgramming.controlFlow.level1.Bonus: ");
        int bonus = sc.nextInt();

        int totalIncome = salary + bonus;

        System.out.printf("The salary is INR %d and bonus is INR %d. Hence Total Income is INR %d", salary, bonus, totalIncome);
        sc.close();
    }
}

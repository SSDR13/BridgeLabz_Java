package coreProgramming.arrays.Level1;//3, Multiplication table of a number


import java.util.*;
public class MultiplicationNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int[] arr = new int[15];

        for(int i = 1; i <= arr.length ; i++){
            System.out.println(num + " * " + i + " = " + num*i);

        }
        sc.close();
    }
}
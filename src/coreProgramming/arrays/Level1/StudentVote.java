package coreProgramming.arrays.Level1;//1. Check whether the student can vote depending on his/her age


import java.util.*;

public class StudentVote{
    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ages of 10 students: ");

        for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();

            if(arr[i] >= 18){
                System.out.println("the student with age " + arr[i] + " can vote");
            }
            else{
                System.out.println("The student with age " + arr[i] + " cannot vote");
            }
        }

    }
}
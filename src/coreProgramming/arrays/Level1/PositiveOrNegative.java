package coreProgramming.arrays.Level1;
//2. Check whether a number is Positive,  Negative, or Zero

import java.util.*;
public class PositiveOrNegative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int[] arr = new int[5];
        for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > 0){
                System.out.println("The number " + arr[i] + " is positive");

            }
            else if(arr[i] < 0 ){
                System.out.println("The number " + arr[i] + " is negative");


            }
            evenodd(arr[i]);


        }
        compare(arr);

    }



    public static void evenodd(int num){
        if(num % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }

    public static void compare(int[] arr){
        if(arr[0] > arr[arr.length - 1]){
            System.out.println("first greater");
        }
        else if(arr[0] == arr[arr.length - 1]){
            System.out.println("equal");
        }
        else{
            System.out.println("first lesser");
        }

    }
}

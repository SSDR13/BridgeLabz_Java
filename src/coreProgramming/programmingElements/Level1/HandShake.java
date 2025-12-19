package coreProgramming.programmingElements.Level1;//16.	Maximum number of handshakes among N

import java.util.*;
public class HandShake{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people present: ");
        int people = sc.nextInt();

        System.out.println(people * (people - 1) / 2);
    }
}

package coreProgramming.arrays.Level1;//7. To save Odd and Even numbers into Odd and Even Arrays
import java.util.*;

public class OddAndEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Error: Please enter a natural number.");
            sc.close();
            return;
        }

        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        System.out.print("Odd Numbers: ");
        System.out.println(Arrays.toString(oddNumbers));

        System.out.print("Even Numbers: ");
        System.out.println(Arrays.toString(evenNumbers));
        sc.close();
    }
}

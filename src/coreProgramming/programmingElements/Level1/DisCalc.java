//9.	University fees Discount calculation (User input)

import java.util.*;
public class DisCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the fees amount: ");
        int fees = sc.nextInt();
        System.out.print("Discount Percentage: ");
        int discountPercent = sc.nextInt();

        int discount = (discountPercent * fees)/100;
        int afterDiscount = fees - discount;

        System.out.printf("The discount amount is INR %d and final discounted fee is INR %d", discount, afterDiscount);
    }
}

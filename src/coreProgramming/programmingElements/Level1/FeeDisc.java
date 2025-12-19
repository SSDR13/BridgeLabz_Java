package coreProgramming.programmingElements.Level1;//6.	University fees Discount calculation

public class FeeDisc {
    public static void main(String[] args) {
        int fees = 125000, discountPercent = 10;

        int discount = (discountPercent * fees)/100;
        int afterDiscount = fees - discount;

        System.out.printf("The discount amount is INR %d and final discounted fee is INR %d", discount, afterDiscount );
    }
}

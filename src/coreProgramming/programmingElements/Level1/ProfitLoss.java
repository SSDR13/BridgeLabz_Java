package coreProgramming.programmingElements.Level1;//4.	To calculate the profit and loss in number and percentage

public class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129, sellingPrice = 191;
        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100;

        System.out.printf("The Cost Price is INR %d and Selling Price is INR %d. \nThe Profit is INR %.1f and the Profit Percentage is %.2f%%.", costPrice, sellingPrice, profit, profitPercent);
    }
}

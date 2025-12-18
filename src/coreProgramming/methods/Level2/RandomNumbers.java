import java.util.Scanner;

public class RandomNumbers {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return new double[]{sum / (double)numbers.length, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.print("Random numbers: ");
        for (int n : arr) System.out.print(n + " ");

        double[] stats = findAverageMinMax(arr);
        System.out.println("\nAverage: " + stats[0] + ", Min: " + stats[1] + ", Max: " + stats[2]);
    }
}

package coreprogramming.javastrings.level1;

import java.util.Scanner;

public class ArrayIndexDemo {

    static void generateException(String[] arr) {
        System.out.println(arr[10]);
    }

    static void handleException(String[] arr) {
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // generateException(names);  // Uncomment to see the crash
        handleException(names);       // Safe handling

        sc.close();
    }
}

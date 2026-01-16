package coreprogramming.javastrings.level1;

import java.util.Scanner;

public class StringIndexDemo {

    static void generateException(String text) {
        text.charAt(100);
    }

    static void handleException(String text) {
        try {
            text.charAt(100);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // generateException(text);
        handleException(text);
    }
}

package coreprogramming.javastrings.level2;

import java.util.Scanner;

class StringLengthDemo {

    static int findLength(String s) {
        int count = 0;
        try {
            for (;; count++) {
                s.charAt(count);
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int customLen = findLength(input);
        int builtInLen = input.length();

        System.out.println("Custom Length: " + customLen);
        System.out.println("Built-in Length: " + builtInLen);
    }
}

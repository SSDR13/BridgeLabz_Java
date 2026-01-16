package coreprogramming.javastrings.level3;

import java.util.Scanner;

public class UniqueCharacters {

    static int length(String s) {
        int count = 0;
        for (char c : s.toCharArray()) count++;
        return count;
    }

    static char[] uniqueChars(String s) {
        int n = length(s);
        char[] temp = new char[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) temp[idx++] = c;
        }

        char[] result = new char[idx];
        for (int i = 0; i < idx; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] res = uniqueChars(text);
        for (char c : res) System.out.print(c + " ");
    }
}

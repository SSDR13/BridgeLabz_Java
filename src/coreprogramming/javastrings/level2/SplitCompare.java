package coreprogramming.javastrings.level2;

import java.util.Scanner;

class SplitCompare {

    static int findLength(String s) {
        int count = 0;
        try {
            for (;; count++) s.charAt(count);
        } catch (Exception e) {
            return count;
        }
    }

    static String[] customSplit(String text) {
        int len = findLength(text);
        int words = 1;

        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') words++;

        int[] spaceIndex = new int[words + 1];
        int idx = 0;
        spaceIndex[idx++] = -1;

        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') spaceIndex[idx++] = i;

        spaceIndex[idx] = len;

        String[] result = new String[words];
        for (int i = 0; i < words; i++)
            result[i] = text.substring(spaceIndex[i] + 1, spaceIndex[i + 1]);

        return result;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtIn = text.split(" ");

        System.out.println("Comparison Result: " + compareArrays(custom, builtIn));
    }
}

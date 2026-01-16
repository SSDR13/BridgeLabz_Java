package coreprogramming.javastrings.level2;

import java.util.Scanner;

class WordLength2D {

    static int findLength(String s) {
        int count = 0;
        try {
            for (;; count++) s.charAt(count);
        } catch (Exception e) {
            return count;
        }
    }

    static String[] customSplit(String text) {
        return text.split(" ");
    }

    static String[][] wordLength2D(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(findLength(words[i]));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] result = wordLength2D(words);

        System.out.println("Word\tLength");
        for (String[] row : result)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}

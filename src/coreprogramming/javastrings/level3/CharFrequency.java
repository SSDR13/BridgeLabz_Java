package coreprogramming.javastrings.level3;

import java.util.Scanner;

public class CharFrequency {

    static String[][] frequency(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        String[][] result = new String[s.length()][2];
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c] != 0) {
                result[idx][0] = String.valueOf(c);
                result[idx][1] = String.valueOf(freq[c]);
                freq[c] = 0;
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[][] res = frequency(s);
        for (String[] r : res)
            if (r[0] != null)
                System.out.println(r[0] + " : " + r[1]);
    }
}

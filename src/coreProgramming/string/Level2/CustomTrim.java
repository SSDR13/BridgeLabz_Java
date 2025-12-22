package coreProgramming.string.Level2;

class CustomTrim {

    static int[] trimIndexes(String s) {
        int start = 0, end = s.length() - 1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    static String substring(String s, int start, int end) {
        String res = "";
        for (int i = start; i <= end; i++)
            res += s.charAt(i);
        return res;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
}

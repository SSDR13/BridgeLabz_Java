package coreProgramming.string.Level2;

class CharType {

    static String[][] charAnalysis(String s) {
        String[][] arr = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            arr[i][0] = String.valueOf(s.charAt(i));
            arr[i][1] = VowelConsonantCount.checkChar(s.charAt(i));
        }
        return arr;
    }
}

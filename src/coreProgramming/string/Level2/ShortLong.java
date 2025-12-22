package coreProgramming.string.Level2;

class ShortLong {

    static int[] findShortLong(String[][] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (String[] row : arr) {
            int len = Integer.parseInt(row[1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }
}


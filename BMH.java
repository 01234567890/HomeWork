package bm;

public class BMH {

    public int BMmatch(String text, String str) {
        int[] last = lastInd(str);
        int n = text.length();
        int m = str.length();
        int i = m - 1;
        if (i > n - 1) {
            return -1; 
        }
        int j = m - 1;
        do {
            if (str.charAt(j) == text.charAt(i)) 
                if (j == 0) 
                    return i; 
                 else {
                    i--;
                    j--;
                }
             else {
                i = i + m - Math.min(j, 1 + last[text.charAt(i)]);
                j = m - 1;
            }
        } while (i <= n - 1);
        return -1;
    }

    public int[] lastInd(String str) {
        int[] last = new int[128]; // испоьзование символов ASCII
        for (int i = 0; i < 128; i++) {
            last[i] = -1; 
        }
        for (int i = 0; i < str.length(); i++) {
            last[str.charAt(i)] = i;
        }
        return last;
    }
}

import java.util.Arrays;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null && magazine == null) return true;
        if (ransomNote == null || magazine == null) return false;
        if (ransomNote.length() > magazine.length()) return false;

        final char[] charsR = ransomNote.toCharArray();
        final char[] charsM = magazine.toCharArray();

        Arrays.sort(charsR);
        Arrays.sort(charsM);

        int j = 0;
        for (int i = 0; i < charsR.length; i++) {
            final char r = charsR[i];

            boolean foundM = false;
            while (j < charsM.length) {
                final char m = charsM[j];

                if (r == m) {
                    j++;
                    foundM = true;
                    break;
                } else if (r > m) {
                    j++;
                } else {
                    return false;
                }
            }

            if (!foundM) return false;
        }

        return true;
    }

}

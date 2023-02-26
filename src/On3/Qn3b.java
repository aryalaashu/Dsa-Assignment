package On3;

public class Qn3b {
    public static boolean isMatch(String str, String pattern) {
        int strIndex = 0, patternIndex = 0;
        int strLen = str.length(), patternLen = pattern.length();
        while (strIndex < strLen && patternIndex < patternLen) {
            if (pattern.charAt(patternIndex) == '@') {
                return true;
            } else if (pattern.charAt(patternIndex) == '#') {
                patternIndex++;
                strIndex++;
            } else if (str.charAt(strIndex) == pattern.charAt(patternIndex)) {
                strIndex++;
                patternIndex++;
            } else {
                return false;
            }
        }
        return strIndex == strLen && patternIndex == patternLen;
    }

    public static void main(String[] args) {
        String a1 = "tt", pattern1 = "@";
        String a2 = "ta", pattern2 = "t";
        String a3 = "ta", pattern3 = "t#";
        System.out.println(isMatch(a1, pattern1));
        System.out.println(isMatch(a2, pattern2));
        System.out.println(isMatch(a3, pattern3));
    }
}


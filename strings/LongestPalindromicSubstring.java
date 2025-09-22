public class LongestPalindromicSubstring {

    public static boolean checkPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static int maxLen = 0, start = 0, end = 0;

    public static String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (checkPalindrome(s, i, j) == true) {
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}

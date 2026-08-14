package DSApatterns.SlidingWindow;

public class MaximumLengthSubstringWithTwoOccurrences2 {
    public static int maximumLengthSubstring(String s) {
        int arr[] = new int[26];
        int left = 0;
        int maxLen = Integer.MIN_VALUE;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            arr[ch - 'a']++;
            while (arr[ch - 'a'] > 2) {
                char leftChar = s.charAt(left);
                arr[leftChar - 'a']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "bcbbbcba";
        System.out.println(maximumLengthSubstring(s));
    }
}

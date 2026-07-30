import java.util.Arrays;

public class MinimumNumberPushesTypeWord {
    public static int minimumPushes(String word) {
        int n = word.length();
        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {
            freq[word.charAt(i) - 'a']++;
        }

        Arrays.sort(freq);
        int i = 25, j = 0, sum = 0;
        while (i >= 0) {
            if (j < 8) {
                sum += freq[i];
            } else if (j < 16) {
                sum += 2 * freq[i];
            } else if (j < 24) {
                sum += 3 * freq[i];
            } else
                sum += 4 * freq[i];
            i--;
            j++;
        }

        return sum;
    }

    public static void main(String[] args) {
        String word = "abcde";
        System.out.println(minimumPushes(word));
    }
}

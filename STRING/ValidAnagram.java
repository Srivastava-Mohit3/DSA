package STRING;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean solution1(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int freq[] = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean solution2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        System.out.println(solution1(str1, str2));
        System.out.println(solution2(str1, str2));
    }
}

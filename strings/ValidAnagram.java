package strings;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean solution(String s, String t) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (char ch : s.toCharArray()) {
        // map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }
        // for (char ch : t.toCharArray()) {
        // if (!map.containsKey(ch)) {
        // return false;
        // }
        // map.put(ch, map.get(ch) - 1);
        // if(map.get(ch) < 0) {
        // return false;
        // }
        // }
        // return true;

            if (s.length() != t.length())
                return false;
            int count[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
                count[t.charAt(i) - 'a']--;
            }
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
            return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(solution(s, t));
    }
}

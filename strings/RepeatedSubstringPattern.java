public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            String subString = s.substring(0, i + 1);
            if (len % subString.length() == 0) {
                int noOfReps = len / subString.length();
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < noOfReps; j++) {
                    sb.append(subString);
                }
                System.out.println("substring here:- "+ subString);
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(s));
    }
}

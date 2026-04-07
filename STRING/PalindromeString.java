package STRING;

public class PalindromeString {
    public static boolean solution1(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    public static boolean solution2(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(solution1(str));
        System.out.println(solution2(str));
    }
}

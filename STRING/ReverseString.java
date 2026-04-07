package STRING;

public class ReverseString {
    public static void solution1(String str) {
        System.out.println(new StringBuilder(str).reverse().toString());
    }

    public static void solution2(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }

    public static void solution3(String str) {
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(arr));
    }

    public static void main(String[] args) {
        String str = "hello";
        solution1(str);
        solution2(str);
        solution3(str);
    }
}

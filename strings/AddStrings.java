public class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int dNum1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int dNum2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = dNum1 + dNum2 + carry;
            result.append(sum % 10); // store last digit
            carry = sum / 10;

            i--;
            j--;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "187871", num2 = "123";
        System.out.println(addStrings(num1, num2));
    }
}

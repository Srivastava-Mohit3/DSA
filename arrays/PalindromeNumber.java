package arrays;
public class PalindromeNumber {
    public static Boolean solution(int num) {
        int original = num;
        int rev = 0;
        while (num > 0) {
            int temp = num % 10;
            rev = rev * 10 + temp;
            num/=10;
        }
        return original == rev;
    }
    public static void main(String[] args) {
        int num = 1111;
        System.out.println(solution(num));
    }
}

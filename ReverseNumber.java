public class ReverseNumber {
    private static int solution(int num) {
        int rev = 0;
        while (num > 0) {
            int temp = num % 10;
            rev = rev * 10 + temp;
            num = num / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num = 1989;
        System.out.println(solution(num));
    }
}

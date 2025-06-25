package arrays;
public class CountDigits {
    public static int solution(int num) {
        num = Math.abs(num);
        if (num == 0) return 1;
        int count = 0;
        while (num > 0) {
            num = num /10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 88787988;
        System.out.println(solution(num));
    }
}

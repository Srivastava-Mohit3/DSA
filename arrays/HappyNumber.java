package arrays;
import java.util.HashSet;

public class HappyNumber {
    public static boolean solution(int num) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int sum = 0;
            while (num != 0) {
                int temp = num % 10;
                sum = sum + (temp * temp);
                num = num / 10;
            }
            if (sum == 1) {
                return true;
            }
            num = sum;
            if (set.contains(sum)) {
                break;
            } else {
                set.add(sum);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(solution(n));
    }
}

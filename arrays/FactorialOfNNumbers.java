package arrays;
public class FactorialOfNNumbers {
    public static int solution(int num) {
        if (num == 0)
            return 1;
        return num * solution(num - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(solution(num));
    }
}
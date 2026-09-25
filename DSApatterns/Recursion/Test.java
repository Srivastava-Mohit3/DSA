package DSApatterns.Recursion;

public class Test {
    public static int solution(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + solution(num / 10);
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println(solution(num));
    }
}

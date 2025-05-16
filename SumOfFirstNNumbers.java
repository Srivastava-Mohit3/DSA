public class SumOfFirstNNumbers {
    public static int solution(int num) {
        if (num == 0)
            return 0;
        return num + solution(num - 1);
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(solution(num));
    }
}

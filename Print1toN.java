public class Print1toN {
    public static void solution(int i, int N) {
        if (i > N)
            return;
        System.out.println(i);
        solution(i + 1, N);
    }

    public static void main(String[] args) {
        int N = 7;
        solution(1, N);
    }
}
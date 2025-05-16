public class PrintNto1 {
    public static void solution(int N) {
        if (N == 0)
            return;
        System.out.println(N);
        solution(N - 1);
    }

    public static void main(String[] args) {
        int N = 7;
        solution(N);
    }
}

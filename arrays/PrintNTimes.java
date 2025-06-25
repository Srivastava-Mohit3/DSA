package arrays;
public class PrintNTimes {
    public static void solution(int i, int N) {
        if (i > N)
            return;
        System.out.println("MOHIT");
        solution(i + 1, N);
    }

    public static void main(String[] args) {
        int N = 10;
        solution(1, N);
    }
}

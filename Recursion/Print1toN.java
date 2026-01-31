package Recursion;

public class Print1toN {
    // public static void solution(int num) {
    //     if(num == 0) return;
    //     solution(num - 1);
    //     System.out.print(num + " ");
    // }
    // public static void solution1(int num) {
    //     if(num == 0) return;
    //     System.out.print(num + " ");
    //     solution1(num - 1);
    // }
    public static void solution(int num) {
        if(num == 0) return;
        System.out.print(num + " ");
        solution(num - 1);
        System.out.print(num + " ");
    }
    public static void main(String[] args) {
        int num = 11;
        solution(num);
        System.out.println();
        // solution1(num);
    }
}

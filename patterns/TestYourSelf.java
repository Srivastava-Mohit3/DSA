package patterns;

// import java.util.Scanner;

public class TestYourSelf {
    public static void function_1(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void function_2(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void function_3(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void function_4(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void function_5(int x, int y) {
        for (int i = x; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void function_6(int x, int y) {
        for (int i = x; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter value to put in I:- ");
        // int i = sc.nextInt();
        // System.out.print("Enter value to put in j:- ");
        // int j = sc.nextInt();
        int i = 5;
        int j = 5;
        System.out.println("Result of function 1");
        function_1(i, j);
        System.out.println("Result of function 2");
        function_2(i, j);
        System.out.println("Result of function 3");
        function_3(i, j);
        System.out.println("Result of function 4");
        function_4(i, j);
        System.out.println("Result of function 5");
        function_5(i, j);
        System.out.println("Result of function 6");
        function_6(i, j);
        // sc.close();
    }
}

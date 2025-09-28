package arrays;

public class HCF_LCM {
    public static int HCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        System.out.println("b:- " + b+ " a%b:- " + a % b);
        return HCF(b, a % b);
    }

    public static int LCM(int a, int b, int hcf) {
        return a * b / hcf;
    }

    public static void main(String args[]) {
        int a = 12, b = 18;
        // int a = 10, b = 3;
        // int a = 3, b = 10;
        System.out.println("HCF:- " + HCF(a, b));
        System.out.println("LCM:- " + LCM(a, b, HCF(a, b)));
    }
}

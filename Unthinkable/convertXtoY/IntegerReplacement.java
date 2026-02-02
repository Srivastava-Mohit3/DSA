package Unthinkable.convertXtoY;

public class IntegerReplacement {
    public static int integerReplacement(int n) {
        int count = 0;
        if (n % 2 == 0) {
            while (n > 1) {
                n = n / 2;
                count++;
            }
        } else {
            
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 8; // 3
        System.out.println(integerReplacement(n));
    }
}

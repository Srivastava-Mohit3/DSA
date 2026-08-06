package arrays;

public class SmallestDivisibleDigitProductI {
    public static int smallestNumber(int n, int t) {
        while (true) {
            if (digitProduct(n) % t == 0) {
                return n;
            }
            n++;
        }
    }

    private static int digitProduct(int num) {
        int product = 1;
        while (num > 0) {
            product *= (num % 10);
            num /= 10;
        }
        return product;
    }

    public static void main(String[] args) {
        int n = 15, t = 3;
        System.out.println(smallestNumber(n, t));
    }

    // 16 is the next smallest number greater than or equal to 15 and its digit product is divisible by t
}

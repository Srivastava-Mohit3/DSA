package arrays;

// I 1 V 5 X 10 L 50 C 100 D 500 M 1000

public class RomanToInteger {
    public static int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    private static int solution(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1 < s.length()) && (getValue(s.charAt(i)) < getValue(s.charAt(i + 1)))) {
                sum -= getValue(s.charAt(i));
            } else {
                sum += getValue(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(solution(s));
    }
}
package ARRAYDSAMASTERCHECKLIST;

public class SecondLargestDigitString {
    public static int secondHighest1(String s) {
        int largest = Integer.MIN_VALUE;
        int secLargest = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= 97 && ch <= 122) {
                continue;
            } else {
                int digit = (ch - '0');
                if (digit > largest) {
                    secLargest = largest;
                    largest = digit;
                } else {
                    if (digit < largest && digit > secLargest) {
                        secLargest = digit;
                    }
                }
            }
        }
        return secLargest;
    }

    public static int secondHighest(String s) {
        int largest = Integer.MIN_VALUE;
        int secLargest = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';

                if (digit > largest) {
                    secLargest = largest;
                    largest = digit;
                } else {
                    if (digit < largest && digit > secLargest) {
                        secLargest = digit;
                    }
                }
            }
        }
        return secLargest;
    }

    public static void main(String[] args) {
        String s = "dfa12321afd";
        System.out.println(secondHighest(s));
    }
}

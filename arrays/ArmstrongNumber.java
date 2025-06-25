package arrays;
public class ArmstrongNumber {
    public static Boolean solution(int num) {
        int count = 0;
        int tempNum = num;
        while (tempNum > 0) {
            tempNum /= 10;
            count++;
        }
        tempNum = num;
        int sum = 0;
        while (tempNum > 0) {
            int temp = tempNum % 10;
            sum += Math.pow(temp, count);
            tempNum /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println(solution(num));
    }
}

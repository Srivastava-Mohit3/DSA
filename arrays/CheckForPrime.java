package arrays;
public class CheckForPrime {
    public static Boolean solution(int num){
        for (int i = 2; i < num/2; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 113;
        System.out.println(solution(num));
    }
}

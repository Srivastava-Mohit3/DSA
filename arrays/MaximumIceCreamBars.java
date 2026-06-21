package arrays;

public class MaximumIceCreamBars {
    public static int maxIceCream(int[] costs, int coins) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < costs.length; i++) {
            sum += costs[i];
            if (sum <= coins) {
                count++;
            } else {
                sum -= costs[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int costs[] = { 1, 6, 3, 1, 2, 5}, coins = 20;
        System.out.println(maxIceCream(costs, coins));
    }
}

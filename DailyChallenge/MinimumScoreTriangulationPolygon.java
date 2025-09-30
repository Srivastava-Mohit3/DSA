package DailyChallenge;

public class MinimumScoreTriangulationPolygon {
    public static int minScoreTriangulation(int[] values) {
        int minScore = Integer.MAX_VALUE;
        if(values.length == 3) {
            int res = 1;
            for (int i = 0; i < values.length; i++) {
                res *= values[i];
            }
            return res;
        }
        return 0;
    }

    public static void main(String[] args) {
        int values[] = { 3, 7, 4, 5 };
        System.out.println(minScoreTriangulation(values));
    }
}

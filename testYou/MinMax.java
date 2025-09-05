package testYou;

public class MinMax {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 4, 1, 9 };
        for (int i : sol(arr)) {
            System.out.print(i + " ");
        }
    }

    private static int[] sol(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = 0;
        int min = Integer.MAX_VALUE;
        int secMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
            if (arr[i] < min) {
                secMin = min;
                min = arr[i];
            } else if (arr[i] > min && arr[i] < secMin) {
                secMin = arr[i];
            }
        }
        return new int[] { min, max, secMin, secMax };
    }
}

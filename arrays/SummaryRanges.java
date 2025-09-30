package arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        // List<String> result = new ArrayList<>();
        // for (int i = 0; i < nums.length; i++) {
        //     int start = nums[i];
        //     while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
        //         i++;
        //     }
        //     if (start != nums[i]) {
        //         result.add("" + start + "->" + nums[i]);
        //     } else {
        //         result.add("" + start);
        //     }

        // }
        // return result;


        List<String> res = new ArrayList<>();
        int n = nums.length;
        if (n == 0)
            return res;

        int start = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || nums[i + 1] != nums[i] + 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(nums[start]);
                if (start != i) {
                    sb.append("->").append(nums[i]);
                }
                res.add(sb.toString());
                start = i + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 4, 5, 7 };
        for (String str : summaryRanges(nums)) {
            System.out.print(str);
        }
    }
}

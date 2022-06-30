package problems;

import java.util.HashSet;

public class PivotIndexSolution {

    public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        HashSet<Character> set = new HashSet<>();
        for (int x : nums) {
            sum += x;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}
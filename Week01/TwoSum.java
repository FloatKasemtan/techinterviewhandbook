package Week01;

import java.util.HashMap;

class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                return new int[] { i, map.get(target - nums[i]) };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }
}

public class TwoSum {
    public static void main(String[] args) {
        SolutionTwoSum solution = new SolutionTwoSum();
        // Test case goes here
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(solution.twoSum(nums, target));
    }
    // Runtime: 3 ms, faster than 91.89% of Java online submissions for Two Sum.
    // Memory Usage: 46.1 MB, less than 22.79% of Java online submissions for Two
    // Sum.
    // Pretty satisfy with the result
}
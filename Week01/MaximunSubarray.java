package Week01;

class SolutionMaximunSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int temp = 0;

        for (int i=0; i<nums.length; i++) {
            temp += nums[i];
            if (max < temp)
                max = temp;
            if (temp <= 0)
                temp = 0;
        }
        return max;
    }
}

public class MaximunSubarray {
    public static void main(String[] args) {
        SolutionMaximunSubarray sol = new SolutionMaximunSubarray();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sol.maxSubArray(arr));
    }
//    Runtime: 1 ms, faster than 100.00% of Java online submissions for Maximum Subarray.
//    Memory Usage: 81.4 MB, less than 16.49% of Java online submissions for Maximum Subarray.
}

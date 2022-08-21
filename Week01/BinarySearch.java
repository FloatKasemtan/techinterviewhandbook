package Week01;

class SolutionBinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int center = (right - left)/2;
            if (nums[center] < target) left++;
            else if (nums[center] > target) right++;
            else return center;
        }
        return -1;
    }
}
public class BinarySearch {
    public static void main(String[] args) {
        SolutionBinarySearch sol = new SolutionBinarySearch();
//      test cases goes here
        int[] arr = {1,2,3,5};
        System.out.println(sol.search(arr, 2));
//      Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
//      Memory Usage: 43 MB, less than 93.22% of Java online submissions for Binary Search.
    }
}

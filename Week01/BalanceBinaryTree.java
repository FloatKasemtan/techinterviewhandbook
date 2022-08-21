package Week01;

class SolutionBalanceBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    public int checkHeight(TreeNode node) {
        if (node == null) return 0;
        int left = checkHeight(node.left);
        int right = checkHeight(node.right);

        if(left == -1 || right == -1) return -1;
        if (Math.abs(left - right) > 1) return -1;

        return Math.max(left,right)+1;
    }
}
public class BalanceBinaryTree {
    public static void main(String[] args) {
        SolutionBalanceBinaryTree sol = new SolutionBalanceBinaryTree();
//        Test cases goes here
//        sol.isBalanced();
    }
//    Runtime: 1 ms, faster than 99.13% of Java online submissions for Balanced Binary Tree.
//    Memory Usage: 44 MB, less than 73.40% of Java online submissions for Balanced Binary Tree.
}

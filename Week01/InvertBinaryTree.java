package Week01;


class SolutionInvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(temp);
        return root;
    }
}
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class InvertBinaryTree {
    public static void main(String[] args) {
        SolutionInvertBinaryTree soliution = new SolutionInvertBinaryTree();
        // Test case goes here
        soliution.invertTree(new TreeNode(2,new TreeNode(3),new TreeNode(1)));
    }
//    Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
//    Memory Usage: 41.7 MB, less than 42.42% of Java online submissions for Invert Binary Tree.
//    Impress that it run so fast!
}

package Week01;

class SolutionLowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        if(root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        else if(root.val < p.val && root.val < q.val )
            return lowestCommonAncestor(root.right, p, q);
        else
            return root;
    }
}


public class LowestCommonAncestor {
    public static void main(String[] args) {
        SolutionLowestCommonAncestor sol = new SolutionLowestCommonAncestor();
        // Test cases goes here
        sol.lowestCommonAncestor(new TreeNode(1),new TreeNode(1),new TreeNode(1));
    }
//    Runtime: 5 ms, faster than 90.14% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
//    Memory Usage: 43.2 MB, less than 93.25% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
}

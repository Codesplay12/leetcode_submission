/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    TreeNode ans = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        dfs(root, p, q);

        return ans;
    }

    public int dfs(TreeNode root, TreeNode p, TreeNode q){

        if(root == null)
            return 0;

        int left = dfs(root.left, p, q);

        int right = dfs(root.right, p, q);

        int self = 0;

        if(root == p || root == q)
            self = 1;

        if(left + right + self >= 2 && ans == null)
            ans = root;

        return left + right + self;
    }
}

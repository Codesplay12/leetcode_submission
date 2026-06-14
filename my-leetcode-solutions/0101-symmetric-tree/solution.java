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
    public boolean isSymmetric(TreeNode root) {
        invert(root.left);
      return  isIdentical(root.left,root.right);

    }

    void invert(TreeNode root){
        if(root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);

        
    }

    boolean isIdentical(TreeNode r1,TreeNode r2){
        if(r1 == null && r2 == null) return true;

        if(r1 == null || r2 == null) return false;

        if(r1.val != r2.val) return false;

        return isIdentical(r1.left,r2.left) && isIdentical(r1.right,r2.right);




    
    }
}

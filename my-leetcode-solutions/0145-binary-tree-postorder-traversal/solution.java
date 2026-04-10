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
    public List<Integer> postorderTraversal(TreeNode root) {
          List<Integer> list = new ArrayList<>();
        display(root,list);
        return list;
        
    }
     public static void display(TreeNode root,List<Integer> list){

        if(root == null) return;

        if(root.left != null) display(root.left,list);

      if(root.right != null) display(root.right,list);


        list.add(root.val);

             
     }
}

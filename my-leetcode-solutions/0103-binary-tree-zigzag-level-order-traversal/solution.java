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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean zigzag = true;
        

        while(!q.isEmpty()){
            int lvl = q.size();
            LinkedList<Integer> tmp = new LinkedList<>();
            while(lvl -- > 0){
                TreeNode t = q.poll();
                if(zigzag){
                    tmp.addLast(t.val);
                }
                else{
                     tmp.addFirst(t.val);
                   
                }
                if(t.left != null){
                    q.add(t.left);
                }
                if(t.right != null){
                    q.add(t.right);
                }
            }
            res.add(tmp);
            zigzag = !zigzag;
        }
        return res;
    }
}

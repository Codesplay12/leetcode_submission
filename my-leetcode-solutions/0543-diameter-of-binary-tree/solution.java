class Solution {
    int maxDia = 0; // ✅ global to track diameter

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDia;
    }

    public int height(TreeNode root){
        if(root == null) return 0;

        int l = height(root.left);  // ✅ left height
        int r = height(root.right); // ✅ right height

        maxDia = Math.max(maxDia, l+r); // ✅ update diameter

        return Math.max(l,r) + 1; // ✅ return HEIGHT
    }
}

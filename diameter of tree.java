class Solution {
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return d;

    }
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=depth(root.left);
        int right=depth(root.right);
         d=Math.max(d,left+right);
        return Math.max(left,right)+1;
    }
}
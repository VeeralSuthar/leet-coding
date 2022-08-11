

public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return check(root,null,null);
    }
    
    private boolean check(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if ((min != null && root.val <= min) || (max != null && root.val >= max)) return false;
        return check(root.left,min,root.val) && check(root.right,root.val,max);
    }
    public class TreeNode {
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
}

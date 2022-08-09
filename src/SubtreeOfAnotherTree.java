public class SubtreeOfAnotherTree {

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
   public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (subRoot == null) return true;
    if (root == null) return false;
    if (identical(root,subRoot)) return true;
    return (isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot));
}
    private boolean identical(TreeNode r, TreeNode s) {
    if (r == null && s == null) return true;
    if (r == null|| s == null) return false;
    if (r.val != s.val) return false;
    return (identical(r.left,s.left) && identical(r.right,s.right));
}
}

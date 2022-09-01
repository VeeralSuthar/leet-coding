public class CountGoodNodesInBT {
    int count;
    public int goodNodes(TreeNode root) {
        count = 0;
        isGood(root,Integer.MIN_VALUE);
        return count;
    }
    
    public void isGood(TreeNode node, int max) {
        if (node == null) return;
        
        if(node.val >= max) count++;
        max = Math.max(max, node.val);
        isGood(node.left,max);
        isGood(node.right,max);
    }

    private class TreeNode {     
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
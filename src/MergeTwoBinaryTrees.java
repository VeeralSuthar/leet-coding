/* Title: Merge Two Binary Trees
 * 
 * Problem: You are given two binary trees root1 and root2. Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not. You need to merge the two trees into a 
 * new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of the new tree. Return the merged tree.
 * 
 * Author: Veeral Suthar
 *
 * Date: 07/21/2022
 * 
 * Solution: Recurisve DFS. 
 * Time Complexity: O(V+E) where V and E are vectors and edges respectively.
 */

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        // both are null
        if (root1 == null && root2 == null) return null;
        // root 1 is null but not root 2
        if (root1 == null) return root2;
        // root 2 is null but not root 1
        if (root2 == null) return root1;
        
        TreeNode node = new TreeNode(root1.val + root2.val);
        
        node.left = mergeTrees(root1.left, root2.left);
        node.right = mergeTrees(root1.right, root2.right);
        
        return node;
    }
}
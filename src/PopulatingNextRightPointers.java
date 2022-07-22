/*
 * TITLE: Populating Next Right Pointers in Each Node 
 * 
 * PROBLEM: You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. Populate each next pointer to point to its next right node. If there is no next right node, the next
 * pointer should be set to NULL. Initially, all next pointers are set to NULL.
 * 
 * AUTHOR: Veeral Suthar
 *
 * DATE: 07/21/2022
 * 
 * SOLUTION: Iterative solution. Rode the left of the tree and dealt with the trees one level at a time. BFS.
 * TIME COMPLEXITY: O(V+E)
 */

class PopulatingNextRightPointers {
    public Node connect(Node root) {
        
        // Base case
        if (root == null) return null;
        
        //Node that will be used the traverse the left side depth of the tree
        Node leftNode = root;
        // Traverse downward
        while (leftNode.left != null) {
            //node that will be used to traverse the breath of the level.
            Node head = leftNode;
            // Traverses outward
            while (head != null) {
                head.left.next = head.right;
                //make sure that there is a head.next
                if (head.next != null) {
                    head.right.next = head.next.left;
                }
                head = head.next;
            }
            leftNode = leftNode.left;
        }
        return root;
    }
}
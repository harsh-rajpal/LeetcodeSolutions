package Balanced_Binary_Tree;
// Given a binary tree,determine if it is height-balanced.

// Example 1:

// Input:root=[3,9,20,null,null,15,7]Output:true Example 2:

// Input:root=[1,2,2,3,3,null,null,4,4]Output:false Example 3:

// Input:root=[]Output:true

// Constraints:

// The number of nodes in the tree is in the range[0,5000].-104<=Node.val<=104
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
    
}

//Algorithm
// 1. If the root is null, return true.
// 2. Create a variable leftHeight to store the height of the left subtree.
// 3. Create a variable rightHeight to store the height of the right subtree.
// 4. Return true if the absolute difference between leftHeight and rightHeight is less than or equal to 1 and the left subtree is balanced and the right subtree is balanced, otherwise return false.

//Time Complexity: O(n^2) where n is the number of nodes in the tree.

//Space Complexity: O(n) where n is the number of nodes in the tree.

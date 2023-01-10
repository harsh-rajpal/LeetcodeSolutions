package Same_Tree;

public class Solution {
   
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null)
                return true;
            if (p == null || q == null)
                return false;
            if (p.val != q.val)
                return false;
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    
}
//Algorithm
// 1. If both the trees are empty, return true.
// 2. If both the trees are not empty, then check if the root node of both the trees are same.
// 3. If the root node of both the trees are same, then recursively check for the left and right subtree of both the trees.
// 4. If the root node of both the trees are not same, then return false.
// 5. If the left subtree of both the trees are not same, then return false.
// 6. If the right subtree of both the trees are not same, then return false.
// 7. If all the above conditions are satisfied, then return true.


//Time Complexity: O(n)
//Space Complexity: O(n)
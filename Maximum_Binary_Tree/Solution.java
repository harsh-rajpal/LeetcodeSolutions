package Maximum_Binary_Tree;
public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int maxIndex = left;
        for (int i = left; i <= right; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = constructMaximumBinaryTree(nums, left, maxIndex - 1);
        root.right = constructMaximumBinaryTree(nums, maxIndex + 1, right);
        return root;
    }
}

//Algorithm
// 1. Find the maximum value in the array.
// 2. Create a node with the maximum value.
// 3. Recursively build the left subtree on the subarray prefix to the left of the maximum value.
// 4. Recursively build the right subtree on the subarray suffix to the right of the maximum value.
// 5. Return the maximum binary tree built from nums.


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int res = 0;

         if (root == null){ 
            return 0;
        }
    
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null){ 
                res =res + root.left.val;
            }
            else{ 
                res =res + sumOfLeftLeaves(root.left);
            }
        }
    res =res + sumOfLeftLeaves(root.right);

    return res;
    }
}
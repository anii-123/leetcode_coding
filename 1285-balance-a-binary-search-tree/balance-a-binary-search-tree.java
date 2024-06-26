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
    public TreeNode balanceBST(TreeNode root) {
        if (root == null) return null;
        List<TreeNode> inorderTraversal = new ArrayList<>();
        inorder(root, inorderTraversal);
        return solve(inorderTraversal, 0, inorderTraversal.size() - 1);
    }

    private void inorder(TreeNode root, List<TreeNode> nodes) {
        if (root == null) return;
        inorder(root.left, nodes);
        nodes.add(root);
        inorder(root.right, nodes);
    }

    private TreeNode solve(List<TreeNode> nodes, int start, int end) {
        if (end < start) return null;
        int mid = (end - start) / 2 + start;
        TreeNode root = nodes.get(mid);
        root.left = solve(nodes, start, mid - 1);
        root.right = solve(nodes, mid + 1, end);
        return root;
    }
}
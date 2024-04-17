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
    public String smallestFromLeaf(TreeNode root) {
        return sfl(root,"");
    }

     String s="";
    public String sfl(TreeNode root,String sum){
        if(root==null){
            return "";
        }
        sum=(char)(root.val+97)+sum;
        if(root.left==null && root.right==null){
            //int q=Integer.parseInt(sum);
            if(s==""){
                s=sum;
            }
            if(s.compareTo(sum)>0)
                s=sum;
        }
        sfl(root.left,sum);
        sfl(root.right,sum);
        return s;
    }
}
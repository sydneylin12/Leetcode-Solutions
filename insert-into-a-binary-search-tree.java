/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        
        if(root.left != null && val < root.val){
            insertIntoBST(root.left, val);
        }
        else if(root.left == null && val < root.val){
            root.left = new TreeNode(val);
        }
        
        if(root.right != null && val > root.val){
            insertIntoBST(root.right, val);
        }
        else if(root.right == null && val > root.val){
            root.right = new TreeNode(val);
        }
        
        return root;
    }
}

class Solution {
    public TreeNode correctBinaryTree(TreeNode root) {
        Map<TreeNode, Integer> map = new HashMap<>();
        fill(map, root, 0);
        return helper(map, root);
    }
    
    public void fill(Map<TreeNode, Integer> map, TreeNode root, int level){
        if(root == null) return;
        map.put(root, level);
        fill(map, root.left, level+1);
        fill(map, root.right, level+1);
    }
    
    public TreeNode helper(Map<TreeNode, Integer> map, TreeNode root){
        if(root == null) return null;
        
        if(root.right != null){ // Check for bad right node
            int other = map.get(root.right);
            int curr = map.get(root);
            if(curr == other) return null;
        }
        
        root.left = helper(map, root.left);
        root.right = helper(map, root.right);
        return root;
    }
}

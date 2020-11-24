/**
 * This is the interface for the expression tree Node.
 * You should not remove it, and you can define some classes to implement it.
 */
​
abstract class Node {
    public abstract int evaluate();
    public String val;
    public boolean isExpression;
    public Node left;
    public Node right;
};
​
class TreeNode extends Node{
    public TreeNode(String val, boolean isExpression){
        this.val = val;
        this.isExpression = isExpression;
    }
    
    public int evaluate(){
        // Leaf node/num node case
        if(!isExpression) return Integer.parseInt(val);
        else{
            switch (val){
                case "+":
                    return left.evaluate() + right.evaluate();
                case "-":
                    return left.evaluate() - right.evaluate();
                case "*":
                    return left.evaluate() * right.evaluate();
                case "/":
                    return left.evaluate() / right.evaluate();
                default: return 0;
            }
        }
    }
    
    // Helper debug
    public void traverse(Node root){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i = 0; i < n; i++){
                Node temp = queue.poll();
                System.out.print(temp.val + " ");
                if(temp.left != null) queue.offer(temp.left);
                if(temp.right != null) queue.offer(temp.right);
            }
            System.out.println("");
        }

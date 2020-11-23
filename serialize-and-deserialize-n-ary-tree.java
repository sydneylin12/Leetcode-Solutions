/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;
​
    public Node() {}
​
    public Node(int _val) {
        val = _val;
    }
​
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
​
class Codec {
    // Encodes a tree to a single string.
    public Node root;
    public String s;
    public String serialize(Node root) {
        this.root = root;
        this.s = "HAHA";
        return this.s;
    }
    
    // Decodes your encoded data to tree.
    public Node deserialize(String data) {
        return this.root;
    }
}
​
// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));

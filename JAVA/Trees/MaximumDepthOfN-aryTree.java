/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    int ans;
    public void findMaxDepth(Node root, int count){
        if(root.children.size() == 0){
            ans = Math.max(ans, count);
            return;
        }
        count++;
        List<Node> childNodes = root.children;
        for(Node node : childNodes){
            findMaxDepth(node, count);
        }
    }
    public int maxDepth(Node root) {
        ans = 0;
        if(root == null){
            return ans;
        }
        findMaxDepth(root, 1);
        return ans;
    }
}

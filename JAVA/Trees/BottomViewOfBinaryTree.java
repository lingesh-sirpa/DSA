/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    
    class Pair{
        Node node;
        int idx;
        
        Pair(Node node, int idx){
            this.node = node;
            this.idx = idx;
        }
    }
    
    int minLeftLength = 0;
    int maxRightLength = 0;
    
    public void getMinLeft(Node root, int idx){
        if(root == null){
            return;
        }
        minLeftLength = Math.min(minLeftLength, idx);
        getMinLeft(root.left, idx - 1);
        getMinLeft(root.right, idx + 1);
    }
    
    public void getMaxRight(Node root, int idx){
        if(root == null){
            return;
        }
        maxRightLength = Math.max(maxRightLength, idx);
        getMaxRight(root.right, idx + 1);
        getMaxRight(root.left, idx - 1);
        
    }
    
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        getMinLeft(root, 0);
        getMaxRight(root, 0);
        int n = maxRightLength - minLeftLength + 1;
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ans.add(0);
        }
        
        LinkedList<Pair> q = new LinkedList<>();
        q.addLast(new Pair(root, 0));
        
        while(q.size() > 0){
            int size = q.size();
             while(size > 0){
                 Pair rem = q.removeFirst();
                 int idx = rem.idx + Math.abs(minLeftLength);
                 ans.set(idx, rem.node.data);
                 
                 if(rem.node.left != null){
                     q.addLast(new Pair(rem.node.left, rem.idx - 1));
                 }
                 
                 if(rem.node.right != null){
                     q.addLast(new Pair(rem.node.right, rem.idx + 1));
                 }
                 size--;
             }
        }
        
        return ans;
    }
}

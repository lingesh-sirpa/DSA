import java.util.*;

class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}


class BST{
    Node root = null;
    BST(){

    }
    Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
}

public class Main {
    

    public static List<Integer> levelOrderTraversal(Node root){
    
    ArrayList<Integer> ans = new ArrayList<>();

    LinkedList<Node> q = new LinkedList<>();
    q.addLast(root);

    while(q.size() > 0){
      int size = q.size();
       while(size > 0){
        Node rem = q.removeFirst();
        ans.add(rem.val);
        size--;
        if(rem.left != null){
            q.addLast(rem.left);
        }
        if(rem.right != null){
            q.addLast(rem.right);
        }
       }
    }

    return ans; 
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }

       List<Integer> list = levelOrderTraversal(t.root);   

       for(int val : list){
        System.out.print(val+ " ");
       }    

    }
}

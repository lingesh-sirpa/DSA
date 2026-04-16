
import java.util.*;
import java.io.*;

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
    BST(Node root){
        root=root;
    }
    Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.val == val)
            return root;
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    void print(Node root){
        System.out.print(root.val + " ");
        if(root.left != null){
            print(root.left);
        }
        if(root.right != null){
            print(root.right);
        }
    }
}

class Solution{
    
    static Node getMin(Node root){
        Node temp = root;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }
    static Node find(Node root, int key){
       if(root == null){
        return null;
       }
       if(root.val < key){
         root.right = find(root.right, key);
       }else if(root.val > key){
         root.left = find(root.left, key);
       }else{
          if(root.left != null && root.right != null){
          Node rightMin = getMin(root.right);
          int temp = root.val;
          root.val = rightMin.val;
          rightMin.val = temp;
          root.right = find(root.right, key);
          }else if(root.left != null){
              return root.left;
          }else if(root.right != null){
              return root.right;
          }else{
              return null;
          }
       }
       return root;
    }

    public Node deleteNode(Node root, int val){
        return find(root, val);
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }
        Solution obj=new Solution();
        t.root= obj.deleteNode(t.root, k);
        t.print(t.root);
    }
}

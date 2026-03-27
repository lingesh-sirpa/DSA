import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Main {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length) break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        Node root1 = buildTree(s1);
        Solution g = new Solution();
        g.binaryTreeZigZagTraversal(root1);
    }
}


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

class Solution {
    public static void binaryTreeZigZagTraversal(Node root) {
      
      ArrayList<Integer> ans = new ArrayList<>();

      LinkedList<Node> q1 = new LinkedList<>();
      LinkedList<Node> q2 = new LinkedList<>();
      boolean flag = true;
      q1.addLast(root);
      q2.addLast(root);

      while(q1.size() != 0 && q2.size() != 0){
        int s1 = q1.size();
        int s2 = q2.size();
        
        if(flag == true){
          while(s1 > 0){
            Node rem = q1.removeFirst();
            ans.add(rem.data);
            s1--;
            if(rem.left != null){
              q2.addLast(rem.left);
            }
            if(rem.right != null){
              q2.addLast(rem.right);
            }
          }
          while(s2 > 0){
            Node rem = q2.removeFirst();
            s2--;
            if(rem.right != null){
              q1.addLast(rem.right);
            }
            if(rem.left != null){
              q1.addLast(rem.left);
            }
          }
          flag = false;
        }
        else{
          while(s1 > 0){
            Node rem = q1.removeFirst();
            ans.add(rem.data);
            s1--;
            if(rem.right != null){
              q2.addLast(rem.right);
            }
            if(rem.left != null){
              q2.addLast(rem.left);
            }
          }
          while(s2 > 0){
            Node rem = q2.removeFirst();
            s2--;
            if(rem.left != null){
              q1.addLast(rem.left);
            }
            if(rem.right != null){
              q1.addLast(rem.right);
            }
          }
          flag = true;
        }
      }

    for(int j = 0; j < ans.size(); j++){
      System.out.print(ans.get(j)+" ");
    }
    }
}

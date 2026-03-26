import java.util.*;

public class Main {

  static Node getNode(int data) {
    // Allocate memory
    Node newNode = new Node();

    // put in the data
    newNode.data = data;
    newNode.left = newNode.right = null;
    return newNode;
  }

  // function to construct a BST from
  // its level order traversal
  static Node LevelOrder(Node root, int data) {
    if (root == null) {
      root = getNode(data);
      return root;
    }
    if (data <= root.data) root.left =
      LevelOrder(root.left, data); else root.right =
      LevelOrder(root.right, data);
    return root;
  }

  static Node constructBst(int arr[], int n) {
    if (n == 0) return null;
    Node root = null;

    for (int i = 0; i < n; i++) root = LevelOrder(root, arr[i]);

    return root;
  }

  public static int checkTreeIsBalance(Node root){
     if(root == null){
       return 0;
     }
     int lH = checkTreeIsBalance(root.left);
     if(lH == -1){
      return -1;
     }
     int rH = checkTreeIsBalance(root.right);
     if(rH == -1){
      return -1;
     }
     int diff = Math.abs(lH - rH);
     if(diff > 1){
      return -1;
     }
     return Math.max(lH, rH) + 1;
  }

  public static boolean isBalanced(Node root) {
     int h = checkTreeIsBalance(root);
     if(h == -1){
      return false;
     }else{
      return true;
     }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] tree = new int[n];
    for (int i = 0; i < n; i++) tree[i] = sc.nextInt();
    sc.close();
    Node root = constructBst(tree, n);
    if (isBalanced(root)) System.out.println("true"); else System.out.println(
      "false"
    );
  }
}

class Node {

  int data;
  Node left, right;
}

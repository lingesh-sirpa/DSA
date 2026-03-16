import java.util.*;

class Node{
    int data;
    Node prev;
    Node next;
      
      Node(int data){
        this.data = data;
      }
}

class Solution {

    Node head = null;
    Node tail = null;

    public boolean presentKey(int key){
      Node t = head;
      while(t != null){
        if(key == t.data){
            return true;
        }
        t = t.next;
      }
      return false;
    }

    public void add(int key) {

       if(presentKey(key) == false){
        Node n = new Node(key);
        if(head == null && tail == null){
            head = n;
            tail = n;
        }else{
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
       }
    }

    public Node findNodeAndRemove(int key){

      Node temp = head;
      while(temp != null){

        if(temp == head && head.data == key){
            head = head.next;
        }
        else if(temp == tail && tail.data == key){
            Node p = tail.prev;
            p.next = null;
            tail.prev = null;
            tail = p;
        }
        else if(temp.data == key){
           Node p = temp.prev;
           Node n = temp.next;
           p.next = n;
           n.prev = p;
        }
        temp = temp.next;
      }

      return head;
    }

    public void remove(int key) {
      
      if(presentKey(key) == true){
        findNodeAndRemove(key);
      }
    }

    public boolean contains(int key) {
      return presentKey(key);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Solution Obj = new Solution();
        for (int i = 0; i < q; i++) {
            int choice = sc.nextInt();
            int key = sc.nextInt();
            if (choice == 1) {
                // Add
                Obj.add(key);
            } else if (choice == 2) {
                // contains
                if (Obj.contains(key)) {
                    System.out.print("True ");
                } else {
                    System.out.print("False ");
                }
            } else if (choice == 3) {
                // remove
                Obj.remove(key);
            }
        }
        System.out.println();
        sc.close();
    }
}

import java.util.*;

class Queue {
    
    class Node{
        int data;
        Node next;
         public Node(int data){
            this.data = data;
         }
    }
    Node head = null;
    Node tail = null;
    int size = 0;

    public void push(int value) {
      Node newNode = new Node(value);
      if(head == null && tail == null){
        head = newNode;
        tail = newNode;
      }else{
        tail.next = newNode;
        tail = newNode;
      }
      size++;
    }
    public int pop() {
       int val = head.data;
       head = head.next;
       size--;
       return val;
    }
    public int front() {
       return head.data;
    }
    public int getSize() {
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if(op == 1) {
                int x = sc.nextInt();
                q.push(x);
            }
            else if(op == 2) {
                System.out.println(q.pop());
            }
            else if(op == 3)
                System.out.println(q.front());
            else if(op == 4)
                System.out.println(q.getSize());
        }
    }
}

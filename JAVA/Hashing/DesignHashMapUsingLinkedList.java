class Node{
    int[] data;
    Node prev;
    Node next;
     
     public Node(int[] data){
        this.data = data;
     }
}

class MyHashMap {

    Node head;
    Node tail;
    public MyHashMap() {
      this.head = null;
      this.tail = null;
    }
    
    public boolean presentKey(int key){
       Node temp = head;
       while(temp != null){
         int[] b = temp.data;
         if(b[0] == key){
            return true;
         }
         temp = temp.next;
       }
       return false;
    }

    public void put(int key, int value) {
    
      if(presentKey(key) == false){
      int[] a = {key, value};
      Node newNode = new Node(a);

      if(head == null && tail == null){
        head = newNode;
        tail = newNode;
      }else{
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
      }
    }
     else{
        Node temp = head;
        while(temp != null){
          int[] c = temp.data;
          if(c[0] == key){
            c[1] = value;
          }
          temp = temp.next;
        }
    }
    
    }
    
    public int get(int key) {

       int getValueOfKey = -1;
       if(presentKey(key) == true){
         Node temp = head;
         while(temp != null){
          int [] c = temp.data;
          if(c[0] == key){
             getValueOfKey = c[1];
          }
          temp = temp.next;
         }
       }
    
     return getValueOfKey;
    }
    
    public void remove(int key) {
       
      if(presentKey(key) == true){
        Node temp = head;
        while(temp != null){
            int[] c = temp.data;
            if(head == tail && c[0] == key){
                head = null;
                tail = null;
            }
            else if(temp == head && c[0] == key){
                Node n = temp.next;
                n.prev = null;
                temp.next = null;
                head = n;
            }else if(temp == tail && c[0] == key){
                Node p = tail.prev;
                p.next = null;
                tail = p;
            }else if(c[0] == key){
                Node p = temp.prev;
                Node n = temp.next;
                p.next = n;
                n.prev = p;
            }
            temp = temp.next;
        }
      }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

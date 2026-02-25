class LRUCache {

   public class Node{
        int key; int value;
        Node next; Node prev;

        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    HashMap<Integer, Node> map;
    Node head;
    Node tail;
    int capacity;

    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.head = null;
        this.tail = null;
        this.capacity = capacity;
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        updateKeyInLL(node);
        return node.value;
    }

    public void addNodeAtFirstPosition(Node nn){
       if(head == null && tail == null){
         head = nn;
         tail = nn;
       }
       else{
          nn.next = head;
          head.prev = nn;
          head = nn;
       }
    }

    public void deleteLastNode(){
        if(head == tail){
            head = null;
            tail = null;
            return;
        }
        Node p = tail.prev;
        p.next = null;
        tail = p;
    }

    public void updateKeyInLL(Node ru){
      //Recently used key updates in LL
      if(ru != head && ru != tail){
        Node p = ru.prev;
        Node n = ru.next;
        p.next = n; 
        n.prev = p;
        ru.next = null; ru.prev = null;
        addNodeAtFirstPosition(ru);
      }
      else if(ru == tail){
        deleteLastNode();
        ru.next = null;
        ru.prev = null;
        addNodeAtFirstPosition(ru);
      }
    }
    
    public void put(int key, int value) {
        if(this.map.containsKey(key)){
            //Update
            Node upNode = map.get(key);
            upNode.value = value;
            updateKeyInLL(upNode);
        }
        else{
            //Insert
            if(map.size() == capacity){
               //If map.size() more than capacity then remove least recently used key in map and ll
               int lru = tail.key;
               map.remove(lru);
               deleteLastNode();
            }
              //Insert node in map and linkedlist
              Node nn = new Node(key, value);
              this.map.put(key, nn);
              addNodeAtFirstPosition(nn);
        }
    }
}

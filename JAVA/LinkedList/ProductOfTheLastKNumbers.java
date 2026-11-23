class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class ProductOfNumbers {
    Node head;
    public ProductOfNumbers() {
        head = null;
    }
    
    public void add(int num) {
        Node node = new Node(num);
        node.next = head;
        head = node;
    }
    
    public int getProduct(int k) {
        int product = 1;
        Node temp = head;
        while(temp != null && k > 0){
            product *= temp.val;
            temp = temp.next;
            k--;
        }

        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */

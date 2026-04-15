class Solution {
    public int minOperations(String s) {
        int count = 0;
        LinkedList<Character> q = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            q.addLast(s.charAt(i));
        }

        while(q.size() > 0){
          count++;
          int size = q.size();
          while(size-- != 0){
          char ch = q.removeFirst();
          if(ch == 'z'){
             q.addLast('a');
          }
          if(ch >= 'b' && ch <= 'y'){
            q.addLast((char)(ch + 1));
          }
        }
        
        }

        return --count;
    }
}

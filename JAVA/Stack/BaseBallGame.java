class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
              Stack<Integer> temp = new Stack<>();
              int count = 2; int sum = 0;
              while(st.size() > 0 && count > 0){
                  sum += st.peek();
                  temp.push(st.pop());
                  count--;
              }
              while(temp.size() > 0){
                 st.push(temp.pop());
              }
              st.push(sum);
            }else if(operations[i].equals("C")){
                if(st.size() > 0){
                    st.pop();
                }
            }else if(operations[i].equals("D")){
                if(st.size() > 0){
                    st.push(2 * st.peek());
                }
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }

        int totalSum = 0;
        while(st.size() > 0){
            totalSum += st.pop();
        }

        return totalSum;
    }
}

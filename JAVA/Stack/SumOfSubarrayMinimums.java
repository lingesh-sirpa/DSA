class Solution {
    public int sumSubarrayMins(int[] arr) {
     Stack<Integer> st = new Stack<>();
     int[] lse = new int[arr.length];
     for(int i=0; i<arr.length; i++){
        while(st.size() > 0 && arr[st.peek()] >= arr[i]){
            st.pop();
        }
        if(st.size() == 0){
            lse[i] = -1;
        }else{
            lse[i] = st.peek();
        }
        st.push(i);
     }

     st = new Stack<>();
     int[] rse = new int[arr.length];
     for(int i=arr.length-1; i>=0; i--){
      while(st.size() > 0 && arr[st.peek()] > arr[i]){
        st.pop();
      }
      if(st.size() == 0){
        rse[i] = arr.length;
      }else{
        rse[i] = st.peek();
      }
      st.push(i);
     }
     
     long mod = (int)Math.pow(10,9) + 7;
     long sum = 0;
     for(int i=0; i<arr.length; i++){
       long le = i-lse[i];
       long re = rse[i]-i;
       long totsubarr = le*re;
       sum = (sum + (arr[i]*totsubarr)%mod)%mod;
     }
   
     return (int) sum;
    }
}

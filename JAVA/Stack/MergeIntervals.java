class Solution {
    public int[][] merge(int[][] arr) {
     Arrays.sort(arr, (a,b) -> a[0] - b[0]);
     Stack<int[]> st = new Stack<>();
     st.push(arr[0]);
     int i=1;
     while(i < arr.length){
        int [] a = st.peek();
        int [] b = arr[i];
        int en1 = a[1];
        int st2 = b[0];
        int en2 = b[1];
        if(st2 <= en1){
          a[1] = Math.max(en1, en2);
        }else{
          st.push(b);
        }
        i++;
     }


     int[][] ans = new int[st.size()][2];
     int k = ans.length-1;
     while(st.size() > 0){
        ans[k] = st.pop();
        k--;
     }
     return ans;
    }
}

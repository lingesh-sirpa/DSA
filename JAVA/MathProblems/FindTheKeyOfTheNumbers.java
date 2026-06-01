class Solution {
    public int generateKey(int num1, int num2, int num3) {
        
        Stack<Integer> st = new Stack<>();
        int totalDigits = 4;
        while(totalDigits > 0){
           int rem1 = 0; int rem2 = 0; int rem3 = 0;
           if(num1 > 0){
             rem1 = num1 % 10;
             num1 /= 10;
           }
           if(num2 > 0){
            rem2 = num2 % 10;
            num2 /= 10;
           }
           if(num3 > 0){
            rem3 = num3 % 10;
            num3 /= 10;
           }
           st.push(Math.min(rem1, Math.min(rem2, rem3)));
           totalDigits--;
    }
    
    while(st.size() > 0 && st.peek() == 0){
        st.pop();
    }
    int ans = 0;
    while(st.size() > 0){
       ans = ans * 10 + st.pop();
    }

    return ans;
   }
}

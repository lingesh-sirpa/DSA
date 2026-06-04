class Solution {
    public int totalWaviness(int num1, int num2) {
        
        int ans = 0;
        
        for(int i = num1; i <= num2; i++){
            String s = Integer.toString(i);
             int k = 2;
             int count = 0;
             while(k < s.length()){
                int firstDigit = s.charAt(k - 2) - '0';
                int middleDigit = s.charAt(k - 1) - '0';
                int lastDigit = s.charAt(k) - '0';
                if(firstDigit < middleDigit && middleDigit > lastDigit){
                    count++;
                }
                if(firstDigit > middleDigit && middleDigit < lastDigit){
                    count++;
                }
                k++;
             }
             ans += count;
        }

        return ans;
    }
}

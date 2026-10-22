class Solution {
    public boolean check(int n){
       for(int i = 2; i < (n - 1); i++){
         if(n % i == 0){
            return false;
         }
       }
       return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        int[] freq = new int[101];
        for(int i : nums){
            freq[i]++;
        }
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 1 && check(freq[i])){
               return true;
            }
        }

        return false;
    }
}

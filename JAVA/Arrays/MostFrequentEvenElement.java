class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i : nums){
            if(i % 2 == 0){
              freq.put(i, freq.getOrDefault(i, 0) + 1);
            }
        }

        int ans = -1;
        if(freq.size() == 0){
            return ans;
        }
        
        int fq = Integer.MIN_VALUE;
        for(int i : freq.keySet()){
           if(freq.get(i) > fq){
             ans = i;
             fq = freq.get(i);
           }
           if(freq.get(i) == fq && i < ans){
              ans = i;
           }
        }

        return ans;

    }
}

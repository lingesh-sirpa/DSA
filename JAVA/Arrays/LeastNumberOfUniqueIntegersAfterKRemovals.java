class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int[] freq = new int[map.size()];
        int j = 0;
        for(int i : map.keySet()){
           freq[j] = map.get(i);
           j++;
        }
        Arrays.sort(freq);

        int m = 0;
        while(k > 0){
            if(freq[m] <= k){
               k = k - freq[m];
               freq[m] = 0;
            }else{
               k = 0;
               freq[m] = freq[m] - k;
            }
           if(freq[m] == 0){
             m++;
           }
        }

        return freq.length - m;
    }
}

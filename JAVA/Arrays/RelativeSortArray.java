class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = Integer.MIN_VALUE;
        for(int i : arr1){
            max = Math.max(max, i);
        }
        int[] freq = new int[max + 1];
        for(int i : arr1){
            freq[i]++;
        }
        int k = 0;
        for(int i : arr2){
           while(freq[i]-- > 0){
             arr1[k] = i;
             k++;
           }
        }
        for(int j = 0; j < freq.length; j++){
            while(freq[j]-- > 0){
                arr1[k] = j;
                k++;
            }
        }

        return arr1;

    }
}

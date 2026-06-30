class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int maxEle = 1;
        int prev = 1;
        for(int i = 1; i < arr.length; i++){
            if(Math.abs(arr[i] - prev) <= 1){
                maxEle = Math.max(maxEle, arr[i]);
                prev = arr[i];
            }else{
                maxEle = maxEle + 1;
                prev = maxEle;
            }
        }

        return maxEle;
    }
}

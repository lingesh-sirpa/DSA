class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int[] arr = new int[101];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
        }
        List<Integer> li = new ArrayList<>();
        int p = 0;
        for(int i = 0; i < arr.length; i++){
            p = arr[i];
            if(arr[i] > k){
               p = k;
            }
            while(p > 0){
                li.add(i);
                p--;
            }
        }

        int[] ans = new int[li.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = li.get(i);
        }

        return ans;
    }
}

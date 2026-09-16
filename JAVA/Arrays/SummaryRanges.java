class Solution {
    public List<String> summaryRanges(int[] nums) {

        int n = nums.length;
        List<String> ans = new ArrayList<>();
        if(n == 0){
            return ans;
        }

        int i = 0; int j = 0;
        String s = "";
        while(j < n - 1){
            if(i == j && nums[j] + 1 != nums[j + 1]){
                s += nums[i];
                ans.add(s);
                s = "";
                i++; j++;
            }else if(i != j && nums[j] + 1 != nums[j + 1]){
                s = nums[i] + "->" + nums[j];
                ans.add(s);
                s = "";
                j++; i = j;
            }else{
                j++;
            }
        }

        if(i == n - 1){
            s += nums[i];
        }else{
            s = nums[i] + "->" + nums[n - 1];
        }
        ans.add(s);

        return ans;
    }
}

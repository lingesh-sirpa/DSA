class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            String str = Integer.toString(nums[i]);
            for(int k = 0; k < str.length(); k++){
                list.add(str.charAt(k));
            }
        }

        int[] ans = new int[list.size()];
        for(int k = 0; k < list.size(); k++){
            ans[k] = list.get(k) - '0';
        }

        return ans;
    }
}

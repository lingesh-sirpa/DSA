class Solution {

    public int findGCDOfMinMax(int minNum, int maxNum){
        if(maxNum == 0){
            return minNum;
        }
        return findGCDOfMinMax(maxNum, minNum % maxNum);
    }
    
    public int findGCD(int[] nums) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for(int num : nums){
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }

        return findGCDOfMinMax(minNum, maxNum);
    }
}

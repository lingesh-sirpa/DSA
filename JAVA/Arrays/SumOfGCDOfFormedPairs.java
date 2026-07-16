class Solution {

    public long findGCD(long num1, long num2){
        if(num2 == 0){
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }

    public long gcdSum(int[] nums) {

        long[] prefixGcd = new long[nums.length];
        long max = Long.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
           max = Math.max(nums[i], max);
           prefixGcd[i] = findGCD(nums[i], max);
        }

        Arrays.sort(prefixGcd);
        long sum = 0;
        int a = 0; int b = prefixGcd.length - 1;

        while(a < b){
            sum += findGCD(prefixGcd[a], prefixGcd[b]);
            a++;
            b--;
        }
        
        return sum;
    }
}

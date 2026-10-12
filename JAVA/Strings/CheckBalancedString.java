class Solution {
    public boolean isBalanced(String num) {
        int evenIndexSum = 0;
        int oddIndexSum = 0;
        for(int i = 0; i < num.length(); i += 2){
            evenIndexSum += (num.charAt(i) - '0');
            if(i + 1 < num.length()){
             oddIndexSum += (num.charAt(i + 1) - '0');
            }
        }

        return evenIndexSum == oddIndexSum;
    }
}

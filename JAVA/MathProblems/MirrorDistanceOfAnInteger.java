class Solution {
    public int mirrorDistance(int n) {
        int m = n;
        int rev = 0;
        while(m > 0){
          rev = rev*10 + (m%10);
          m = m/10;
        }
        return Math.abs(n - rev);
    }
}

class Solution {

    public boolean check(int[] piles, int h, int mid){
       long time = 0;
       for(int i = 0; i < piles.length; i++){
           time += (piles[i] + mid - 1) / mid;
       }
       return time <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = 0;
        for(int i = 0; i < piles.length; i++){
            hi = Math.max(hi, piles[i]);
        }

        int ans = -1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(check(piles, h, mid)){
                ans = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }

        return ans;
    }
}

class Solution {
    public int largestAltitude(int[] gain) {
        int hiAlt = 0;
        int psum = 0;
        for(int i = 0; i < gain.length; i++){
           psum += gain[i];
           hiAlt = Math.max(hiAlt, psum);
        }
        return hiAlt;
    }
}

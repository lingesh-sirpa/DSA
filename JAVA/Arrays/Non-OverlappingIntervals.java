class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int ans = 0;
        int lastEndTime = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            int presentStartTime = intervals[i][0];
            if(presentStartTime < lastEndTime){
                ans = ans + 1;
            }else{
                lastEndTime = intervals[i][1];
            }
        }

        return ans;
    }
}

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        if(intervals.length == 1){
            return 1;
        }
        
        Arrays.sort(intervals,(a, b) -> {
           if(a[0] != b[0]){
            return Integer.compare(a[0], b[0]);
           }
           return Integer.compare(b[1], a[1]);
        });

          int[] invl = intervals[0];
          int maxEnd = invl[1];
          int count = 1;

          for(int i = 1; i < intervals.length; i++){
              int[] invl1 = intervals[i];
              if(invl1[1] > maxEnd){
                count++;
                maxEnd = invl1[1];
              }
          }


        return count;
    }
}

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> st = new Stack<>();
        int i = 0; int n = intervals.length; 
        while(i < n && intervals[i][1] < newInterval[0]){
            st.push(intervals[i]);
            i++;
        }
        while(i < n && intervals[i][0] <= newInterval[1]){
           newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
           newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
           i++;
        }
        st.push(newInterval);
        while(i < n){
            st.push(intervals[i]);
            i++;
        }

        int[][] ans = new int[st.size()][2];
        int k = ans.length - 1;
        while(st.size() > 0){
            ans[k] = st.pop();
            k--;
        }

        return ans;

    }
}

class Solution {
    public int heightChecker(int[] heights) {
        int ans = 0;
        LinkedList<Integer> q = new LinkedList<>();
        for(int i : heights){
            q.addLast(i);
        }
        Arrays.sort(heights);
        int i = 0;
        while(q.size() != 0){
            if(q.removeFirst() != heights[i]){
                ans++;
            }
            i++;
        }

        return ans;
    }
}

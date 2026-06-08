class Solution {

    static List<List<Integer>> ans = new ArrayList<>();
    
    public void combinations(List<Integer> li, int st, int end, int k){
       if(li.size() == k){
        ans.add(new ArrayList<>(li));
        return;
       }
       for(int j = st + 1; j <= end; j++){
         li.add(j);
         combinations(li, j, end, k);
         if(li.size() > 0){
           li.remove(li.size() - 1);
         }
       }
        
    }
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            List<Integer> li = new ArrayList<>();
            li.add(i);
            combinations(li, i, n, k);
        }
        return ans;
    }
}

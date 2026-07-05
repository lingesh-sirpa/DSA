class Solution {

    static List<List<Integer>> ans = new ArrayList<>();

    public void dfs(int[][] graph, int idx, List<Integer> li){
       if(idx == graph.length - 1){
            ans.add(new ArrayList<>(li));
            return;
       }
       int[] edges = graph[idx];
       for(int i = 0; i < edges.length; i++){
         li.add(edges[i]);
         dfs(graph, edges[i], li);
         li.remove(li.size() - 1);
       }

    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ans.clear();
        List<Integer> li = new ArrayList<>();
        li.add(0);
        dfs(graph, 0, li);
        return ans;
    }
}

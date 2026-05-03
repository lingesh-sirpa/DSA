class Solution {
    
    public void dfs(ArrayList<ArrayList<Integer>> graph, int vtx, boolean[] vis, Stack<Integer> st){
        if(vis[vtx]){
            return;
        }
        vis[vtx] = true;
        ArrayList<Integer> edges = graph.get(vtx);
        for(int nbr : edges){
           dfs(graph, nbr, vis, st);
        }
        
        st.push(vtx);
        
    }
    
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < V; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i = 0; i < edges.length; i++){
            int[] edge = edges[i];
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
        }
        
        boolean[] vis = new boolean[V];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < graph.size(); i++){
            if(!vis[i]){
                dfs(graph, i, vis, st);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        while(st.size() > 0){
            ans.add(st.pop());
        }
        
        return ans;
        
    }
}

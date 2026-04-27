import java.io.*;
import java.util.*;

class Solution {
    
    static boolean dfs(ArrayList<ArrayList<Integer>> graph, int vtx, boolean[] vis, int pvtx){
        vis[vtx] = true;
        ArrayList<Integer> nbrs = graph.get(vtx);
        for(int nbr : nbrs){
           if(nbr != pvtx && vis[nbr]){
             return true;
           }

           if(nbr != pvtx){
             if(!vis[nbr]){
                boolean res = dfs(graph, nbr, vis, vtx);
                if(res == true){
                    return true;
                }
             }
           }
        }

        return false;
    }
    
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
       boolean[] vis = new boolean[V];
       for(int i = 0; i < V; i++){
        if(!vis[i]){
            boolean res = dfs(adj, i, vis, -1);
            if(res == true){
                return true;
            }
        }
       }

       return false;
    }
}

public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N, E;
        N = sc.nextInt();
        E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<N; i++) adj.add(i, new ArrayList<Integer>());    
        for(int i =0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean ans = Solution.isCycle(N,adj);
        if(ans)
            System.out.println("1");
        else
            System.out.println("0");
    }
}

import java.io.*;
import java.util.*;
class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(read.readLine());
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i<N; i++)
        {
            String S[] = read.readLine().split(" ");
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<N; j++)
                temp.add(Integer.parseInt(S[j]));
            adj.add(temp);
        }

        Solution ob = new Solution();
        System.out.println(ob.components(adj,N));
    }
}

class Solution {

    static void dfs(ArrayList<ArrayList<Integer>> adj, int vtx, boolean[] vis){

        vis[vtx] = true;
        ArrayList<Integer> nbrs = adj.get(vtx);
        for(int i = 0; i < nbrs.size(); i++){
           if(!vis[i] && i != vtx && nbrs.get(i) == 1){
            dfs(adj, i, vis);
        }
      }
    }

    int components(ArrayList<ArrayList<Integer>> adj, int N) {
        int ans = 0;
        boolean[] vis = new boolean[N];
        for(int i = 0; i < N; i++){
            if(!vis[i]){
                ans++;
                dfs(adj, i, vis);
            }
        }

        return ans;
    }
};

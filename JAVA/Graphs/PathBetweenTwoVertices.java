import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < M; i++) {
            ArrayList<Integer> e = new ArrayList<Integer>();
            e.add(sc.nextInt());
            e.add(sc.nextInt());
            Edges.add(e);
        }
        int U=sc.nextInt();
        int V=sc.nextInt();
        Solution ob = new Solution();
        if (ob.check(N, M, Edges,U,V)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

}

class Solution {
    
    public boolean checkPath(ArrayList<ArrayList<Integer>> graph, int U, int V, boolean[] vis){
        if(U == V){
            return true;
        }
        vis[U] = true;
        ArrayList<Integer> nbrs = graph.get(U);
        for(int edge : nbrs){
          if(!vis[edge]){
            boolean res = checkPath(graph, edge, V, vis);
            if(res == true){
                return true;
            }
          }
        }
        return false;
    }
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges,int U,int V) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < Edges.size(); i++){
            ArrayList<Integer> edge = Edges.get(i);
            int u = edge.get(0);
            int v = edge.get(1);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return checkPath(graph, U, V, new boolean[N + 1]);
       
    }
}

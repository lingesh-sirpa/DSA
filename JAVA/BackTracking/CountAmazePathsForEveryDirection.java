import java.util.*;

public class Main {
    
    static int count = 0;
    static int[][] dir = {{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}};
    static void countPaths(int sr, int sc, int dr, int dc, boolean[][] vis){
        if(sr == dr && sc == dc){
            count++;
            return;
        }
        if(sr < 1 || sc < 1 || sr > dr || sc > dc || vis[sr - 1][sc - 1]){
            return;
        }
        vis[sr - 1][sc - 1] = true;
        for(int i = 0; i < dir.length; i++){
        countPaths(sr + dir[i][0], sc + dir[i][1], dr, dc, vis);
        }
        vis[sr - 1][sc - 1] = false;
        return;
    }
    static int countAllPath(int n, int m){  
        count = 0; 
        boolean[][] vis = new boolean[n][m];
        countPaths(1, 1, n, m, vis);
        return count;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        System.out.println(countAllPath(n,m));
    }
}

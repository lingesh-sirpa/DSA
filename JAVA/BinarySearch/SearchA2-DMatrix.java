import java.util.*;

public class Main {

    public static boolean SearchA2DMatrix(int[][] mat, int x) {
      int m = mat.length; int n = mat[0].length;
      int i=0; int j=m-1;
      int ansRow = -1;
      while(i <= j){
        int mid = i+(j-i)/2;
         if(mat[mid][0] <= x && x <= mat[mid][n-1]){
            ansRow = mid;
            break;
         }
         else if(mat[mid][n-1] < x){
            i = mid+1;
         }
         else{
            j = mid-1;
         }
      }
      
      i=0; j=n-1;
      while(i <= j){
        int mid = i+(j-i)/2;
        if(mat[ansRow][mid] == x){
            return true;
        }
        else if(mat[ansRow][mid] > x){
            j = mid-1;
        }
        else{
            i = mid+1;
        }
      }
      return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i = 0; i< m; i++) {
            for(int j = 0; j<n; j++)
                mat[i][j] = sc.nextInt();
        }
        int x = sc.nextInt();
        if(SearchA2DMatrix(mat, x))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

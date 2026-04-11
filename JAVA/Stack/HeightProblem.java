import java.util.*;

class Accio{
    static int[] HeightProblem(int n,int[] arr){
       int[] ans = new int[n];
       Stack<Integer> st1 = new Stack<>();
       for(int i = 0; i < n; i++){
          while(st1.size() > 0 && st1.peek() >= arr[i]){
                st1.pop();
          }
         if(st1.size() > 0 && st1.peek() < arr[i]){
            ans[i] = st1.peek();
         }else if(st1.size() == 0){
            ans[i] = -1;
         }
         st1.push(arr[i]);
       }
       return ans;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        int[] ans=obj.HeightProblem(n,arr);
        for(int i=0;i<n;++i){
            System.out.print(ans[i] + " ");
        }
    }
}

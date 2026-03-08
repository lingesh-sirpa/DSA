import java.util.*;

class Solution {
    public void allDuplicates(int n, int[] arr) {
      ArrayList<Integer> li = new ArrayList<>();
      HashSet<Integer> map = new HashSet<>();

      int i=0;
      while(i < arr.length){
        if(map.contains(arr[i])){
            li.add(arr[i]);
        }
        map.add(arr[i]);
        i++;
      }

      for(int j=0; j<li.size(); j++){
        System.out.print(li.get(j)+" ");
      }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.allDuplicates(n, arr);
        sc.close();
    }
}

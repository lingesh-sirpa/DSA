import java.io.*;
import java.util.*;

public class Main {

    public static int subarrayDivisbleByK(int arr[], int n, int k){
      int j = 0; int psumj = 0;
      int count = 0;
      HashMap<Integer, Integer> li = new HashMap<>();
      li.put(0, 1);
      while(j < arr.length){
       psumj += arr[j];
       int rem = psumj%k;
       if(rem < 0){
        rem += k;
       }
       if(li.containsKey(rem)){
         count += li.get(rem);
       }
       li.put(rem, li.getOrDefault(rem, 0) + 1);
       j++;
      }
     return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        int result = subarrayDivisbleByK(arr, n, k);
        System.out.print(result);        
        System.out.println('\n');
    }
}

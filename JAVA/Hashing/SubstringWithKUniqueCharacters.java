import java.util.*;

public class Main {

    public static int longestkSubstr(int n, int k,String s){
        int i=0; int j=0; int max = -1;

        HashMap<Character, Integer> li = new HashMap<>();
        while(j < s.length()){
         char chj = s.charAt(j);
         if(li.containsKey(chj)){
            li.put(chj, li.get(chj) + 1);
         }
         else{
            li.put(chj, 1);
         }
         if(li.size() == k){
            max = Math.max(max, j-i+1);
         }
         while(li.size() > k){
           char chi = s.charAt(i);
           if(li.containsKey(chi)){
            li.put(chi, li.get(chi) - 1);
            if(li.get(chi) == 0){
                li.remove(chi);
            }
           } 
           i++;
         }
         j++;
        }
        return max;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int ans = longestkSubstr(n,k,s);
        System.out.println(ans);
    }
}

import java.util.*;

public class Main {

    public static long DistinctCharacterSubstring(String s){
        
        HashSet<Character> map = new HashSet<>();
        long count = 0;
        int i=0; int j=0;
        while(j < s.length()){
         char chj = s.charAt(j);
         if(map.contains(chj)){
           char chi = s.charAt(i);
           map.remove(chi);
           i++;
         }else{
            map.add(chj);
            count += (j-i+1);
            j++;
         }
        }

        return count;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long ans = DistinctCharacterSubstring(s);
        System.out.println(ans);
    }
}

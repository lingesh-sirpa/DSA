import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    public static int solve(String A) {
        
     int i=0; int j=A.length()-1;
     int c=1;
     while(i < j){
       char chi = A.charAt(i);
       char chj = A.charAt(j);
       
       if(chi != chj && c == 0){
        return 0;
       }
       
       if(chi != chj && c != 0){
          c--;
         if(A.charAt(i+1) == chj){
            i++;
         }else if(chi == A.charAt(j-1)){
            j--;
         }
       }else if(chi == chj){
         i++; j--;
       }
     }

     return 1;
    }
}

public class Main{
          public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
	    String A = sc.nextLine();
            Solution Obj = new Solution();
            int ans=Obj.solve(A);
            System.out.println(ans);
	}
}

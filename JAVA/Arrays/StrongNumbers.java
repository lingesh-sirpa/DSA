import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
     static boolean isPrime(int number){
      int i=2; int val = number;
      while(i < number){
        if(val%i == 0){
            return false;
        }
        i++;
      }
      return true;
    }

    public static boolean strongNumbers(long n) 
    {  
       if(isPrime((int)n) == true){
         return false;
       }
       int i=2; long num = n;
       while(i < n){
        if(num%i == 0 && isPrime(i) == true){
          int sqnum = i*i;
          if(num%sqnum != 0){
            return false;
          }
        }
        i++;
       }
       return true;
    } 
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        if(strongNumbers(n))
        System.out.println(1);
        else
        System.out.println(0);
	}
}

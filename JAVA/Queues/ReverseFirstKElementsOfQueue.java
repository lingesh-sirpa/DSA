import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            q.add(input.nextInt());
        }
        Stack<Integer> st = new Stack<>();
        int j = k;
        while(j > 0){
          st.push(q.remove());
          j--;
        }
        while(st.size() > 0){
          q.add(st.pop());
        }
        int m = n - k;
        while(m > 0){
          q.add(q.remove());
          m--;
        }
        while(q.size() > 0){
            System.out.print(q.poll() + " ");
        }
    }
}

import java.util.*;

class Solution{
    public void balancedBrackets(String s, int n) {
      Stack<Character> st = new Stack<>();
      int i=0; boolean flag = true;
      while(i < s.length()){
        char chi = s.charAt(i);
        if(chi == '(' || chi == '{' || chi == '['){
            st.push(chi);
        }
        else{
          if(st.size() == 0){
            flag = false;
            break;
          }
          if(chi == ')' && st.peek() == '('){
            st.pop();
          }
          else if(chi == '}' && st.peek() == '{'){
            st.pop();
          }
          else if(chi == ']' && st.peek() == '['){
            st.pop();
          }
          else{
            flag = false;
            break;
          }
        }
        i++;
      }
      if(st.size() == 0 && flag == true){
        System.out.print("YES");
      }
      else{
        System.out.print("NO");
      }

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Solution Obj = new Solution();
        Obj.balancedBrackets(s, n);
    }
}

import java.util.*;

public class Main {

    public static List<Integer> asteroidCollision(int[] asteroids) {
          int n = asteroids.length;
          Stack<Integer> st = new Stack<>();
          for(int i = 0; i < n; i++){
             int curr = asteroids[i];
             boolean flag = true;

             while(st.size() > 0 && st.peek() > 0 && curr < 0){
                if(Math.abs(st.peek()) < Math.abs(curr)){
                    st.pop();
                }else if(Math.abs(st.peek()) == Math.abs(curr)){
                    st.pop();
                    flag = false;
                    break;
                }else{
                    flag = false;
                    break;
                }
             }

             if(flag == true){
                st.push(asteroids[i]);
             }
          }

          ArrayList<Integer> ans = new ArrayList<>(st);

          return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] asteroids = new int[n];

        for (int i = 0; i < n; i++) {
            asteroids[i] = scanner.nextInt();
        }

        List<Integer> ans = asteroidCollision(asteroids); 

        if(ans.size()==0){
             System.out.print(-1);
        }else{
              for (int asteroid : ans) {
                 System.out.print(asteroid + " ");
              }
        }
    }
}

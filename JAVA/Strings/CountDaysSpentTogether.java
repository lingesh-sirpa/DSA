class Solution {

    static final int[] days = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
          int aliceAD = days[Integer.parseInt(arriveAlice.substring(0, 2)) - 1] + Integer.parseInt(arriveAlice.substring(3));
          int aliceLD = days[Integer.parseInt(leaveAlice.substring(0, 2)) - 1] + Integer.parseInt(leaveAlice.substring(3));
          int bobAD = days[Integer.parseInt(arriveBob.substring(0, 2)) - 1] + Integer.parseInt(arriveBob.substring(3));
          int bobLD = days[Integer.parseInt(leaveBob.substring(0, 2)) - 1] + Integer.parseInt(leaveBob.substring(3));
          
          int[] check = new int[366];
          for(int i = aliceAD; i <= aliceLD; i++){
             check[i]++;
          }
          for(int i = bobAD; i <= bobLD; i++){
             check[i]++;
          }

          int ans = 0;
          for(int i = 0; i < check.length; i++){
             if(check[i] == 2){
                ans++;
             }
          }
          return ans;

    }
}

class Solution {
    public int totalMoney(int n) {
        int everyWeekStart = 2;
        int dailyMoney = 1;
        int totalAmount = 0;
        
        for(int i = 1; i <= n; i++){
            totalAmount += dailyMoney;
            if(i % 7 == 0){
               dailyMoney = everyWeekStart;
               everyWeekStart++;
            }else{
               dailyMoney = dailyMoney + 1;
            }
        }
        

        return totalAmount;
    }
}

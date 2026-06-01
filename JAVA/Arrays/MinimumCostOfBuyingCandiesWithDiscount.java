class Solution {
    public int minimumCost(int[] cost) {
       Arrays.sort(cost);
       int candiesShouldBuy = 2;
       int totalCostToBuyCandies = 0;
       for(int i = cost.length - 1; i >= 0; i--){
             if(candiesShouldBuy == 0){
                candiesShouldBuy = 2;
                continue;
             }
             totalCostToBuyCandies += cost[i];
             candiesShouldBuy--;
       }

       return totalCostToBuyCandies;
    }
}

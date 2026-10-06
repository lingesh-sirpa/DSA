class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
         int maxBottlesDrunk = numBottles;
         int emptyBottles = numBottles;
         while(emptyBottles >= numExchange){
            int remEmptyBottles = emptyBottles % numExchange;
            int getFillBottlesAfterReturnEmptyBottles = emptyBottles / numExchange;
            maxBottlesDrunk += getFillBottlesAfterReturnEmptyBottles;
            emptyBottles = remEmptyBottles + getFillBottlesAfterReturnEmptyBottles;
         }
         

         return maxBottlesDrunk;
    }
}

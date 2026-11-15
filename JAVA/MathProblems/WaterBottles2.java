class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totBottlesDrunk = numBottles;
        int emptyBottles = numBottles;
        while(emptyBottles >= numExchange){
            emptyBottles = emptyBottles - numExchange + 1;
            numExchange++;
            totBottlesDrunk += 1;
        }

       return totBottlesDrunk;
    }
}

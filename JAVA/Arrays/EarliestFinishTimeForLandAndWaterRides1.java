class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
       
        int totalTime = Integer.MAX_VALUE;
       
        int timeForLand = Integer.MAX_VALUE;
        for(int i = 0; i < landStartTime.length; i++){
            timeForLand = Math.min(timeForLand, landStartTime[i] + landDuration[i]);
        }
   
        for(int j = 0; j < waterStartTime.length; j++){
            if(waterStartTime[j] <= timeForLand){
                totalTime = Math.min(totalTime, timeForLand + waterDuration[j]);
            }else{
                totalTime = Math.min(totalTime, waterStartTime[j] + waterDuration[j]);
            }
        }

        int timeForWater = Integer.MAX_VALUE;
        for(int i = 0; i < waterStartTime.length; i++){
            timeForWater = Math.min(timeForWater, waterStartTime[i] + waterDuration[i]);
        }
   
        for(int j = 0; j < landStartTime.length; j++){
            if(landStartTime[j] <= timeForWater){
                totalTime = Math.min(totalTime, timeForWater + landDuration[j]);
            }else{
                totalTime = Math.min(totalTime, landStartTime[j] + landDuration[j]);
            }
        }

        return totalTime;

    }
}

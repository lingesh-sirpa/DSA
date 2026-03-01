class Solution {
    public int[] avoidFlood(int[] rains) {
     int[] ans = new int[rains.length];
     HashMap<Integer, Integer> lakeRainDays = new HashMap<>();
     TreeSet<Integer> noRainDays = new TreeSet<>();

     for(int i=0; i<rains.length; i++){
        if(rains[i] == 0){
          noRainDays.add(i);
          continue;
        }
        else if(!lakeRainDays.containsKey(rains[i])){
          lakeRainDays.put(rains[i], i);
        }
        else{
           int lastRainHappenedDay = lakeRainDays.get(rains[i]);
           Integer noRainDayAfterLastRain = noRainDays.ceiling(lastRainHappenedDay);
           if(noRainDayAfterLastRain == null){
            return new int[0];
           }
           noRainDays.remove(noRainDayAfterLastRain);
           ans[noRainDayAfterLastRain] = rains[i];
           lakeRainDays.put(rains[i], i);
        }
        ans[i] = -1;
     }
      
     for(int i=0; i<ans.length; i++){
        if(ans[i] == 0){
            ans[i] = 1;
        }
     }
     return ans;
    }
}

class Solution {
    public int numRabbits(int[] answers) {
     HashMap<Integer, Integer> li = new HashMap<>();
     for(int i=0; i<answers.length; i++){
        li.put(answers[i], li.getOrDefault(answers[i], 0) + 1);
     }  
    
     int minNumberOfRabbits = 0;
     for(int rabbitsResponse : li.keySet()){
        int totalSameResponse = li.get(rabbitsResponse);
        int groupSize = rabbitsResponse + 1;
        int totalGroups = (int) Math.ceil((totalSameResponse*1.0)/(groupSize*1.0));
        minNumberOfRabbits += (totalGroups*groupSize);
     }
     return minNumberOfRabbits;
    }
}

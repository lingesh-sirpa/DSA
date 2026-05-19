class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] rocksCanAdd = new int[capacity.length];
        for(int i = 0; i < capacity.length; i++){
            rocksCanAdd[i] = capacity[i] - rocks[i];
        }
       
       Arrays.sort(rocksCanAdd);
       int count = 0;
       for(int i = 0; i < rocksCanAdd.length; i++){
          if(rocksCanAdd[i] == 0){
            count++;
            continue;
          }
          if(additionalRocks >= rocksCanAdd[i]){
             count++;
             additionalRocks -= rocksCanAdd[i];
          }
        }

        return count;
    }
}

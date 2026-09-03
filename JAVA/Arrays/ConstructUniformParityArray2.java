class Solution {
    public boolean uniformArray(int[] nums1) {
        int minevenidx = -1;
        int minoddidx = -1;
        int minON = Integer.MAX_VALUE;
        int minEN = Integer.MAX_VALUE;
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] % 2 == 0 && nums1[i] < minEN){
               minevenidx = i;
               minEN = nums1[i];
            }
            if(nums1[i] % 2 != 0 && nums1[i] < minON){
               minoddidx = i;
               minON = nums1[i];
            }
        }

        if(minevenidx != -1 && minoddidx != -1){
             boolean ch1 = true;
             boolean ch2 = true;
             for(int j = 0; j < nums1.length; j++){
                if(j != minevenidx && nums1[j] % 2 != 0 && ch1){
                    if(nums1[j] - minEN < 1 || (nums1[j] - minEN) % 2 != 0){
                        ch1 = false;
                    }
                }

                if(j != minoddidx && nums1[j] % 2 == 0 && ch2){
                    if(nums1[j] - minON < 1 || (nums1[j] - minON) % 2 == 0){
                        ch2 = false;
                    }
                }
                
                if(!ch1 && !ch2){
                    return false;
                }
             }
        }

        return true;
    }
}

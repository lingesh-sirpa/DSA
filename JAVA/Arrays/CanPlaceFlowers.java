class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0; int prev = 0;
        while(i < flowerbed.length){
            if(prev == 0 && flowerbed[i] == 0){
                n--;
                flowerbed[i] = 1;
            }else if(prev == 1 && flowerbed[i] == 1){
                n++;
                flowerbed[i - 1] = 0;
            }
            prev = flowerbed[i];
            i++;
        }

        if(n > 0){
            return false;
        }

        return true;
    }
}

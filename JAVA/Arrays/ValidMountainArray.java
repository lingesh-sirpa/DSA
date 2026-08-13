class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        int max = arr[0];
        int idx = 0;
        for(int i = 1; i < arr.length; i++){
           if(arr[i] >= max){
            idx = i;
            max = arr[i];
           }
        }
        if(idx == 0 || idx == arr.length - 1){
            return false;
        }
        int j = 0;
        while(j < idx){
           if(arr[j] >= arr[j + 1]){
              return false;
           }
           j++;
        }
        j = idx;
        while(j < arr.length - 1){
            if(arr[j] <= arr[j + 1]){
               return false;
            }
            j++;
        }

        return true;
    }
}

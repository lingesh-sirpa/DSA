class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Arrays.sort(digits);
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < digits.length; i++){
           if(i > 0 && digits[i] == digits[i - 1] || digits[i] == 0){
             continue;
           }
           int num = digits[i];
           for(int j = 0; j < digits.length; j++){
              if(j == i){
                continue;
              }
              num = num * 10 + digits[j];
              for(int k = 0; k < digits.length; k++){
                if(k == i || k == j){
                    continue;
                }
                num = num * 10 + digits[k];
                if(num % 2 == 0 && num > 99 && num < 1000){
                    set.add(num);
                }
                num = num / 10;
              }
              num = num / 10;
           }
        }
       

        int[] ans = new int[set.size()];
        int k = 0;
        for(int p : set){
            ans[k] = p;
            k++;
        }
        Arrays.sort(ans);
        return ans;
    }
}

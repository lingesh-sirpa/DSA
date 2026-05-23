class Solution {
    public boolean check(int[] nums) {
        boolean flag = true;
        int i = 0; int j = 1;
        while(i < nums.length - 1){
            if(nums[i] > nums[j]){
                flag = false;
                break;
            }
          i++; j++;
        }

        if(flag == true){
            return true;
        }


        LinkedList<Integer> q = new LinkedList<>();
        int k = 0;
        while(k <= i){
            q.addLast(nums[k]);
            k++;
        }
        k = 0;
        while(j < nums.length){
            nums[k] = nums[j];
            j++; k++;
        }
        while(q.size() > 0){
            nums[k] = q.removeFirst();
            k++;
        }
      
        i = 0; j = 1;
        while(i < nums.length - 1){
            if(nums[i] > nums[j]){
                return false;
            }
            i++; j++;
        }
       return true;
    }
}

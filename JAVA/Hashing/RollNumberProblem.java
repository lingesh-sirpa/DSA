import java.util.*;

class Solution 
{
    static int[] findRepeatingAndMissingNumbers(int[] nums) 
    {
       HashSet<Integer> map = new HashSet<>();
       int max = Integer.MIN_VALUE;
       int repeatnum = 0;
       for(int i=0; i<nums.length; i++){
         if(map.contains(nums[i])){
            repeatnum = nums[i];
         }else{
            map.add(nums[i]);
         }
         max = Math.max(max, nums[i]);
       }

       int j=1; int missingnum = 0;
       while(j < max){
         if(!map.contains(j)){
          missingnum = j;
         }
         j++;
       }
        
       if(missingnum == 0){
         missingnum = max+1;
       }
       int[] ans = {repeatnum, missingnum};
       return ans;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i=0;i<N;i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = Solution.findRepeatingAndMissingNumbers(nums);
        System.out.print(ans[0] + " " + ans[1] + "\n");
    }
}

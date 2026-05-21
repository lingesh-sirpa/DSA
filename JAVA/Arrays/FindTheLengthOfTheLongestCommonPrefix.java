class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
       
        HashSet<Integer> map = new HashSet<>();
        for(int i = 0; i < arr1.length; i++){
            String str = Integer.toString(arr1[i]);
            int j = 0; int k = 0;
            while(k < str.length()){
             String subs = str.substring(j, k + 1);
             map.add(Integer.parseInt(subs));
             k++;
            }
        }

        int ll = 0;
        for(int k = 0; k < arr2.length; k++){
           String s = Integer.toString(arr2[k]);
           int j = 0; int l = 0;
           while(l < s.length()){
            String subs = s.substring(j, l + 1);
            if(map.contains(Integer.parseInt(subs))){
                ll = Math.max(ll, l - j + 1);
            }
            l++;
           }
        }

        return ll;
    }
}

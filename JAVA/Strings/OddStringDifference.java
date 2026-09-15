class Solution {
    public String oddString(String[] words) {

        HashMap<Integer, int[]> map = new HashMap<>();
        int ans = -1;
        for(int j = 0; j < words.length; j++){
            String s = words[j];
            int diff = 0;
            for(int i = 1; i < s.length(); i++){
                diff = (diff * 10) + ((s.charAt(i) - 'a') - (s.charAt(i - 1) - 'a'));
            }
            if(!map.containsKey(diff)){
                int[] arr = {1, j};
                map.put(diff, arr);
            }else{
                int[] arr = map.get(diff);
                arr[0] += 1;
                map.put(diff, arr);
            }
        }

           for(int i : map.keySet()){
              int[] arr = map.get(i);
              if(arr[0] == 1){
                ans = arr[1];
              }
           }
           
       return words[ans];
    }
}

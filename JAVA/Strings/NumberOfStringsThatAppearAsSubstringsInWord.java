class Solution {
    public int numOfStrings(String[] patterns, String word) {
        HashSet<String> set = new HashSet<>();
        int i = 0; 
        while(i < word.length()){
            int j = i;
            while(j < word.length()){
              set.add(word.substring(i, j + 1));
              j++;
            }
           i++;
        }

        int count = 0;
        for(int k = 0; k < patterns.length; k++){
            if(set.contains(patterns[k])){
               count++;
            }
        }

        return count;
    }
}

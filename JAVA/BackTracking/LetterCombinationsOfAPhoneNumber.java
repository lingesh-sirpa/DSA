class Solution {
    
    static List<String> ans = new ArrayList<>();
    String[] list = {"","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public void combinations(String digits, String asf){
        if(digits.length() == 0){
            ans.add(asf);
            return;
        }
        int num = digits.charAt(0) - '0';
        String pattern = list[num];
        for(int i = 0; i < pattern.length(); i++){
            combinations(digits.substring(1), asf + pattern.charAt(i));
        }
    }

    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        combinations(digits, "");
        return ans;
    }
}

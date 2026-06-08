class Solution {

    static List<String> ans = new ArrayList<>();
    public void genPar(int i, int j, int idx, int n, String asf){
       if(i == n && j == n && idx == 0){
         ans.add(asf);
         return;
       }
       if(i < 0 || i > n || j < 0 || j > n || idx < 0 || idx > n){
         return;
       }
       genPar(i + 1, j, idx + 1, n, asf + '(');
       genPar(i, j + 1, idx - 1, n, asf + ')');
    }

    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        genPar(0, 0, 0, n, "");
        return ans;
    }
}

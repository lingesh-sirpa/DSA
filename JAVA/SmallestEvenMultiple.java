class Solution {
    public int smallestEvenMultiple(int n) {
        int p = n;
        while(p % 2 != 0 && p % n == 0){
            p = p + n;
        }

        return p;
    }
}

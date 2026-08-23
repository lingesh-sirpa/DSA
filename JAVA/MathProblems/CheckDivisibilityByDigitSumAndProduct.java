class Solution {

    public boolean checkDivisibility(int n) {
        int p = n;
        int sum = 0;
        int product = 1;
        while(p != 0){
            sum = sum + (p % 10);
            product = product * (p % 10);
            p = p / 10;
        }
        if(n % (sum + product) == 0){
            return true;
        }
        return false;
    }
}

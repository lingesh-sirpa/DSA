class Solution {
    public int reverse(int n){
        int r = 0;
        while(n != 0){
          r = (r * 10) + (n % 10);
          n = n/10;
        }
        return r;
    }
    public boolean checkPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int r = reverse(n);
        int min = Math.min(n, r); int max = Math.max(n, r);
        int sum = 0;
        for(int i = min; i <= max; i++){
            if(i == 1){
                continue;
            }
            if(checkPrime(i)){
              sum = sum + i;
            }
        }

        return sum;
    }
}

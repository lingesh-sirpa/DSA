class Solution {
    public boolean isFascinating(int n) {
        int[] check = new int[10];
        int n2 = 2 * n;
        int n3 = 3 * n;
        while(n > 0){
            check[n % 10]++;
            n /= 10;
        }
        while(n2 > 0){
            check[n2 % 10]++;
            n2 /= 10;
        }
        while(n3 > 0){
            check[n3 % 10]++;
            n3 /= 10;
        }

        for(int i = 0; i < check.length; i++){
            if(i == 0 && check[i] > 0 || i != 0 && check[i] == 0 || i != 0 && check[i] > 1){
                return false;
            }
        }

        return true;
    }
}

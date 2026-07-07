class Solution {

    public String concatenate(String n){
       String s = "";
       for(int i = 0; i < n.length(); i++){
           char ch = n.charAt(i);
           if(ch != '0'){
             s = s + ch;
           }
       }
       return s;
    }

    public long sumOfDigits(long n){
        long sum = 0;
        while(n != 0){
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }

    public long sumAndMultiply(int n) {
       String x = concatenate(Integer.toString(n));
       if(x.length() == 0){
         return 0;
       }
       long sum = sumOfDigits(Integer.parseInt(x));
       return (Integer.parseInt(x) * sum);
    }
}

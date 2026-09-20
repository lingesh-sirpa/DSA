class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0;
        while(i < arr.length){
            int p = i, q = Math.min(i + k - 1, arr.length - 1);
            while(p <= q){
                char temp = arr[p];
                arr[p] = arr[q];
                arr[q] = temp;
                p++; q--;
            }
            i += (2 * k);
        }

      return String.valueOf(arr);
    }
}

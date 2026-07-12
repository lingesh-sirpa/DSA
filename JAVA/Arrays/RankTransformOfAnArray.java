class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0){
            return arr;
        }
        
        int[][] valIndArr = new int[arr.length][2];
        for(int i = 0; i < arr.length; i++){
            valIndArr[i][0] = arr[i];
            valIndArr[i][1] = i;
        }

        Arrays.sort(valIndArr, (a,b) -> Integer.compare(a[0], b[0]));
        int[] ans = new int[arr.length];
        int rank = 1;
        ans[valIndArr[0][1]] = rank;

        for(int i = 1; i < valIndArr.length; i++){
            int[] arr1 = valIndArr[i - 1];
            int[] arr2 = valIndArr[i];
            if(arr2[0] == arr1[0]){
                ans[arr2[1]] = rank;
            }else{
                rank++;
                ans[arr2[1]] = rank;
            }
        }

        return ans;
    }
}

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> map = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(map.contains(arr[i] * 2) || map.contains(arr[i] / 2) && arr[i] % 2 == 0){
                return true;
            }
            map.add(arr[i]);
        }


        return false;
    }
}

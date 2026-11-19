class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i = 0; int j = arr.length - 1;
        while(i <= j){
            char chi = arr[i];
            char chj = arr[j];
            if(((chi >= 'A' && chi <= 'Z') || (chi >= 'a' && chi <= 'z')) && ((chj >= 'A' && chj <= 'Z') || (chj >= 'a' && chj <= 'z'))){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j--;
            }else if(!(chi >= 'A' && chi <= 'Z') && !(chi >= 'a' && chi <= 'z') && !(chj >= 'A' && chj <= 'Z') && !(chj >= 'a' && chj <= 'z')){
                i++; j--;
            }else if(!(chi >= 'A' && chi <= 'Z') && !(chi >= 'a' && chi <= 'z')){
                i++;
            }else{
                j--;
            }
        }

        s = new String(arr);
        return s;
    }
}

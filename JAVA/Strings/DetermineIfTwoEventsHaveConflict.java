class Solution {
    public int convertToSecs(String num){
        int hToSecs = Integer.parseInt(num.substring(0, 2));
        int mToSecs = Integer.parseInt(num.substring(3));
        return ((hToSecs * 60) + mToSecs);
    }
    public boolean haveConflict(String[] event1, String[] event2) {
        int st1 = convertToSecs(event1[0]);
        int en1 = convertToSecs(event1[1]);
        int st2 = convertToSecs(event2[0]);
        int en2 = convertToSecs(event2[1]);
        if(st1 >= st2 && st1 <= en2 || en1 >= st2 && en1 <= en2 || st2 >= st1 && st2 <= en1 || en2 >= st1 && en2 <= en1){
            return true;
        }

        return false;
    }
}

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        LinkedList<int[]> q = new LinkedList<>();

        for(int i = 0; i < tickets.length; i++){
            if(i == k){
                int[] arr = {tickets[i], -1};
                q.addLast(arr);
            }else{
                int[] arr = {tickets[i], 0};
                q.addLast(arr);
            }
        }

        int count = 0;
        while(q.size() > 0){
            int[] firstPerson = q.removeFirst();
            int ticketsReq = firstPerson[0] - 1;
            int reqPerson = firstPerson[1];
            count++;
            if(ticketsReq == 0 && reqPerson == -1){
                return count;
            }
            if(ticketsReq > 0){
               int[] arr = {ticketsReq, reqPerson};
               q.addLast(arr);
            }
        }

        return -1;
    }
}

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        int count = 1;
        LinkedList<Integer> q = new LinkedList<>();
        List<Integer> li = rooms.get(0);
        for(int i = 0; i < li.size(); i++){
            q.addLast(li.get(i));
        }
        vis[0] = true;

        while(q.size() > 0){
            int rem = q.removeFirst();
            if(!vis[rem]){
                count++;
                List<Integer> list = rooms.get(rem);
                for(int k = 0; k < list.size(); k++){
                    q.addLast(list.get(k));
                }
               vis[rem] = true;
            }
        }

        return count == rooms.size();
    }
}

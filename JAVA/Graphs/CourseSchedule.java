class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> [] graph = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; i++){
            graph[i] = new ArrayList<>();
        }

        int[] indegrees = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            int[] p = prerequisites[i];
            int ai = p[0];
            int bi = p[1];
            graph[bi].add(ai);
            indegrees[ai]++;
        }

        LinkedList<Integer> q = new LinkedList<>();
        for(int i = 0; i < indegrees.length; i++){
            if(indegrees[i] == 0){
                q.addLast(i);
            }
        }

        int count = 0;
        while(q.size() > 0){
            int course = q.removeFirst();
            count++;
            ArrayList<Integer> nbrs = graph[course];
            for(int nbr : nbrs){
                indegrees[nbr]--;
                if(indegrees[nbr] == 0){
                    q.addLast(nbr);
                }
            }
        }

        return count == numCourses;
    }
}

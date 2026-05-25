class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> mainli = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        mainli.add(firstRow);

        for(int i = 1; i < numRows; i++){
            List<Integer> li = new ArrayList<>();
            li.add(1);
            List<Integer> prevList = mainli.get(i - 1);
            for(int j = 0; j < prevList.size() - 1; j++){
                int sum = prevList.get(j) + prevList.get(j + 1);
                li.add(sum);
            }
            li.add(1);
            mainli.add(li);
        }

        return mainli;
    }
}

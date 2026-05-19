class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i = 1; int j = skill.length - 2;
        long sumOfChemistry = skill[0] * skill[skill.length - 1];
        int chemistry = skill[0] + skill[skill.length - 1];
        while(i < j){
           int checkChemistry = skill[i] + skill[j];
           if(checkChemistry != chemistry){
             return -1;
           }
          sumOfChemistry += skill[i] * skill[j];
          i++; j--;
        }

        return sumOfChemistry;
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int evenNum = 0;
        int oddNum = 0;
        for(int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenNum += 1;
            } else {
                oddNum += 1;
            }
        }
        int[] answer = {evenNum, oddNum};
        return answer;
    }
}
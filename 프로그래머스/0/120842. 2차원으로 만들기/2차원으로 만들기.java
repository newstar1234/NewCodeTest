class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int cnt = 0;
        
        // i == 행만큼 // j == 열만큼
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[cnt++];
            }
        }
        
        return answer;
    }
}
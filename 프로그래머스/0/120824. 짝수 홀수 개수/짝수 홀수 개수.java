class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        for(int n : num_list) {
            if(n % 2 == 0) answer[0]++; // 짝수일때
            else answer[1]++;           // 홀수일때
        }
        
        return answer;
    }
}
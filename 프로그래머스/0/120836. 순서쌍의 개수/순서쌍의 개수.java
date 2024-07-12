class Solution {
    public int solution(int n) {
        int answer = 0;
        int max = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                max++;
            }
        }
        answer = max;
        return answer;
    }
}
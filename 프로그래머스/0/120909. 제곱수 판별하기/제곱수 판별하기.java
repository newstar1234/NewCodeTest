class Solution {
    public int solution(int n) {
        // int answer = 0;
        // for(int i = 1; i <= n; i++) {
        //     if(i * i == n) {
        //         answer = 1;
        //     }
        // }
        // if(answer != 1) answer = 2;
        // return answer;
        
        // if(n % Math.sqrt(n) == 0) return 1;
        // else return 2;
        
        if(Math.sqrt(n) % 1 == 0) return 1;
        else return 2;
    }
}
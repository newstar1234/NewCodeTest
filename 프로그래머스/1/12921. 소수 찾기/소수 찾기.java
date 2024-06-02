class Solution {
    public int solution(int n) {
        int answer = 0;
        // for(int i = 2; i <= n; i++) {
        //     boolean b = true;
        //     for(int j = 2; j < i; j++) {
        //         if(i % j == 0) {
        //             b = false;
        //             break;
        //         }
        //     }
        //     if(b == true) answer++; 
        // }
        
        for(int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) answer++;
        }
        return answer;
    }
}
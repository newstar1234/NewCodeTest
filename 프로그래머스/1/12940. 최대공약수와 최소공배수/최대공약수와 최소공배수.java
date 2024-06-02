class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int rmax = 0; // 최대공약수
        int rmin = 0; // 최소공배수
        int min = n > m ? m : n; // 최소값
        
        for(int i = 1; i <= min; i++) {
            if(n % i == 0 && m % i == 0) {
                rmax = i;
            }
        }
        // for(int i = 1; i < n && i < m; i++) {
        //     if(n % i == 0 && m % i == 0) {
        //         rmax = i;
        //     }
        // }
        
        rmin = n * m / rmax;
        
        answer[0] = rmax;
        answer[1] = rmin;
        
        return answer;
    }
}
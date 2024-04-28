class Solution {
    public int solution(int[] array) {
        int answer = 0; // 최빈값
        int[] index = new int[1000]; // array 배열 길이 
        int max = 0; // 최댓값
        int count = 0;
        
        for(int n : array) {
            index[n]++;
            if(max < index[n]) {
                max = index[n];
                answer = n;
            }
        }
        for(int n : index) {
            if(max == n) count++;
            if(count > 1) return -1;
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        int diff = 0;
        for(int i = 0; i < array.length; i++) {
            diff = Math.abs(n - array[i]); // 오름차순 정렬
            if(min > diff) {
                min = diff;
                answer = array[i];
            }
            else if(min == diff && array[i] < answer) {
                answer = array[i];
            }
        }
        return answer;
    }
}
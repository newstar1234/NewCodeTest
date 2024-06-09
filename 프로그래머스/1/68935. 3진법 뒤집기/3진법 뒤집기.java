class Solution {
    public int solution(int n) {
        int answer = 0;
        String threeS = Integer.toString(n, 3);
        String reverseT = "";
        
        for(int i = threeS.length() -1; i >= 0; i--) {
            reverseT += String.valueOf(threeS.charAt(i));
        }
        
        answer += Integer.parseInt(reverseT, 3);
        
        return answer;
    }
}
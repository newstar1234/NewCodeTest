import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] be = before.toCharArray();
        char[] af = after.toCharArray();
        
        Arrays.sort(be);
        Arrays.sort(af);
        
        //1
        answer = Arrays.equals(be, af) ? 1 : 0;
        
        //2
        // String s1 = new String(be);
        // String s2 = new String(af);
        // answer = s1.equals(s2) ? 1 : 0;
        
        // if(Arrays.equals(be, af)) {
        //     answer = 1;
        // } else answer = 0;
        
        return answer;
    }
}
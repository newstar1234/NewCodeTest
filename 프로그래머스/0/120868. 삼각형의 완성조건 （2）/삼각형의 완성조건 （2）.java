import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int max = sides[1];
        int min = sides[0];
        
        answer = (max + min) - (max - min) - 1;
        
        return answer;
    }
}
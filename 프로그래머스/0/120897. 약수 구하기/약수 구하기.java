import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        int[] answer = new int[array.size()];
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                array.add(i);
            }
        }
        answer = array.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
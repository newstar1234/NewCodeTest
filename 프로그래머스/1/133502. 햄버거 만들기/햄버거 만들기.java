import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int s : ingredient) {
            stack.push(s);
            if(stack.size() >= 4) {
                int hamSize = stack.size();
                
                if(stack.get(hamSize - 1) == 1 && 
                    stack.get(hamSize - 2) == 3 &&
                    stack.get(hamSize - 3) == 2 &&
                    stack.get(hamSize - 4) == 1) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        
        
        return answer;
    }
}
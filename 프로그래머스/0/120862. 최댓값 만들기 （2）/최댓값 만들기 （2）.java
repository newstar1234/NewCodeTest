import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        //1 
        // int answer = Integer.MIN_VALUE;
        // for(int i = 0; i < numbers.length -1; i++) {
        //     for(int j = i+1; j < numbers.length; j++) {
        //         answer = Math.max(answer, numbers[i] * numbers[j]);
        //     }
        // }
        // return answer;
        
        
        //2
        int answer = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length -1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                list.add(numbers[i] * numbers[j]);
            }
        
        }
        answer = Collections.max(list);
        return answer;
    }
}
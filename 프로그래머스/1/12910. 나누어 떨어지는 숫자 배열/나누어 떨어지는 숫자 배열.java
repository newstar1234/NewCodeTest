import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
//         int [] resultArray = 
//             Arrays.stream(arr).
//             filter(num -> num % divisor == 0).
//             sorted().
//             toArray();
        
//         if(resultArray.length == 0) {
//             return new int[]{-1};
//         }
        
//         return resultArray;
        
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
           if(arr[i] % divisor == 0) 
               list.add(arr[i]);            
        }
        answer = new int[list.size()];
        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
        
    }
}
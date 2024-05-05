import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String arr[] = s.split(" "); // 공백 기준으로 자르기
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("Z")) {
                answer -= Integer.parseInt(arr[i-1]);
            } else {
                answer += Integer.parseInt(arr[i]);
            }
            
        }
//         for(int i = 0; i < list.length; i++) {
//             if(list[i] == "Z") {
//                 list.remove(i);
//                 list.remove(i-1);
//             }
//             else list.add(i);
            
//             answer+= Integer.parseInt(String.valueOf(list));
//         }
        
        
        
        return answer;
    }
}
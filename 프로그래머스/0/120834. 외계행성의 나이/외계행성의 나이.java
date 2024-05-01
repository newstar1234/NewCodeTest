import java.lang.*;
import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
//         StringBuilder sb = new StringBuilder();
//         1
//         while(age > 0) {
//             char ch = (char)('a' +  age % 10);
//             sb.insert(0, ch);
//             age /= 10;
//         }
        
//         answer = sb.toString();    
        
        // 2
        String str = String.valueOf(age);
        for(int i = 0; i < str.length(); i++) {
            char ch = (char)('a' + Integer.parseInt(String.valueOf(str.charAt(i))));
            answer += String.valueOf(ch);
            
        }
        
        return answer;
    }
}
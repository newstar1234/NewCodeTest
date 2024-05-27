import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
//         String[] str = s.split("");
//         int cnt = 0;
        
//         Arrays.sort(str);
        
//         for(int i = 0; i < str.length; i++) {
//             cnt = 0;
//             for(int j = 0; j < str.length; j++) {
//                 if(str[i].equals(str[j])) {
//                     cnt++;
//                 }
//             }
//             if(cnt == 1) {
//                 answer += str[i];
//             }
//         }
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            String key = String.valueOf(s.charAt(i));
            int value = 0;
            value = map.get(key) == null ? 0 : map.get(key);
            map.put(key, ++value);
            // map에 하나씩 넣어줌
        }
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            if(entry.getValue() == 1) list.add(entry.getKey());
            // list에 1개인 문자열 담아줌
        } 
        Collections.sort(list); // 정렬
        answer = String.join("", list);
        return answer;
    }
}
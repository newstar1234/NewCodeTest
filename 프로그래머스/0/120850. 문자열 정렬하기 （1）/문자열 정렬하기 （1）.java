import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        my_string = my_string.replaceAll("[^0-9]", ""); // replceAll 로 문자제거
        for(int i =0; i < my_string.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
        }
        Collections.sort(list);
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        // int[] answer = new int[list.size()];
        // for(int i =0; i < list.size(); i++){
        //     answer[i] = list.get(i);
        // }
        
        // for(int i =0; i < my_string.length(); i++) {
        //     if(isInteger(String.valueOf(my_string.charAt(i)))) {
        //         list.add();
        //     }
        // }
        // 함수 isInteger를 사용해서 하는 방법
        
        return answer;
    }
    // private boolean inInteger(String str) {
    //     try {
    //         Integer.parseInt(str);
    //         return true;
    //     } catch (Exception e) {
    //         return false;
    //     }
    // }
}
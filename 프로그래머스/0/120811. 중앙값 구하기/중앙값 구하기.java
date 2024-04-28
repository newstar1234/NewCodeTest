import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // 버블정렬
        // int temp = 0;
        // for(int i = 0; i < array.length; i++) {
        //     for(int j = 0; j < array.length -1; j++) {
        //         if(array[i] > array[j]) {
        //             temp = array[j];
        //             array[j] = array[i];
        //             array[i] = temp;
        //         }
        //     }
        // }
        Arrays.sort(array); // 자동으로 버블정렬해줌 //
        
        answer = array[array.length / 2];
        
        return answer;
    }
}
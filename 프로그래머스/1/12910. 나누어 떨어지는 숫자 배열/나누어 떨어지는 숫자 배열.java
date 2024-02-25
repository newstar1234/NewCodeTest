import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int [] resultArray = 
            Arrays.stream(arr).
            filter(num -> num % divisor == 0).
            sorted().
            toArray();
        
        if(resultArray.length == 0) {
            return new int[]{-1};
        }
        
        return resultArray;
    }
}
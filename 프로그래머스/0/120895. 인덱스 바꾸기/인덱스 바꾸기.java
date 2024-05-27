class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        ch[num1] = my_string.charAt(num2);
        ch[num2] = my_string.charAt(num1);
        answer = String.valueOf(ch);
        
        // String t1 = String.valueOf(my_string.charAt(num1));
        // String t2 = String.valueOf(my_string.charAt(num2));
        // for(int i = 0; i < my_string.length(); i++) {
        //     String s = String.valueOf(my_string.charAt(i));
        //     if(i == num1) {
        //         answer += t2;
        //     }
        //     else if(i == num2) {
        //         answer += t1;
        //     }
        //     else answer += s;
        // }
        
        // char arr[] = my_string.toCharArray();
        // char tmp = arr[num1];
        // arr[num1] = arr[num2];
        // arr[num2] = tmp;
        // answer = String.valueOf(arr);        
        
        return answer;
    }
}
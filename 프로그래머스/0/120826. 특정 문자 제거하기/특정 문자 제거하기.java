class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] str = my_string.split(letter);
        answer = String.join("", str);
        return answer;
    }
}
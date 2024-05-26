class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int cnt = 0;
        for(String q : quiz) {
            String str[] = q.split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[2]);
            int z = Integer.parseInt(str[4]);
            String o = str[1];
            if(o.equals("+")) {
                answer[cnt++] = (x + y == z) ? "O" : "X";
            }
            else if(o.equals("-")) {
                answer[cnt++] = (x - y == z) ? "O" : "X";
            }
        }
        return answer;
    }
}
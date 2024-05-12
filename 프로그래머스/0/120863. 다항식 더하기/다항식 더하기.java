class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int n = 0;
        
        String[] str = polynomial.split(" \\+ ");
        for(int i =0; i< str.length; i++) {
            if(str[i].contains("x")) {
                x += str[i].equals("x") ? 1 : Integer.parseInt(str[i].replace("x",""));
            }
            else {
                n += Integer.parseInt(str[i]);
            }
        }
        // x값
        if(x == 1) {
            answer = "x";
        } else if(x > 1) {
            answer = x + "x";
        }
        // n값
        if(x == 0 && n > 0) {
            answer = String.valueOf(n);
        } else if(x> 0 && n > 0) {
            answer += String.format(" + %d", n);
        }
        
        return answer;
    }
}
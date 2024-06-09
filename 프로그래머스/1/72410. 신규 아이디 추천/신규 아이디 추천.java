class Solution {
    public String solution(String new_id) {
        String answer = "";
        //1
        answer = new_id.toLowerCase();
        //2
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        
        //3
        // 3-1 answer = answer.replace("..", ".");
        // while(answer.contains("..")){
        //     answer = answer.replace("..", ".");
        // }
        
        // 3-1 answer = answer.replaceAll("[\\.]{2,}", ".");
        
        answer = answer.replaceAll("\\.+", ".");
        
        //4
        // 4-1 if(answer.length() > 0 && answer.startsWith(".")){
        //     answer = answer.substring(1);
        // }
        // if(answer.length() > 0 && answer.endsWith(".")) {
        //     answer = answer.substring(0, answer.length() -1);
        // }
        
        // 4-2 answer = answer.replaceAll("^[\\.]", "");
        // answer = answer.replaceAll("[\\.]$", "");
        
        answer = answer.replaceAll("^[.]|[.]$", "");
        
        //5
        if(answer.equals("")) {
            answer = "a";
        }
        
        //6
        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }
        
        //7
        // 7-1 if(answer.length() <= 2) {
        //     String lw = answer.substring(answer.length()-1, answer.length());
        //     while(answer.length() <= 2) {
        //         answer += lw;
        //     }
        // }
        
        while(answer.length() < 3){
            answer += answer.charAt(answer.length() -1);
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String temp = ""; // 정수를 저장
        int dart[] = new int[3]; // 3회
        int idx = 0; // 인덱스
        
        for(int i = 0;i < dartResult.length();i++){
            char c = dartResult.charAt(i);
            switch(c){
                case 'S':
                    dart[idx++] = (int)Math.pow(Integer.parseInt(temp),1);
                    temp ="";
                    break;
                case 'D':
                    dart[idx++] = (int)Math.pow(Integer.parseInt(temp),2);
                    temp ="";
                    break;        
                case 'T':
                    dart[idx++] = (int)Math.pow(Integer.parseInt(temp),3);
                    temp ="";
                    break; 
                case '*':
                    dart[idx - 1] *= 2;
                    if(idx - 2 >= 0) dart[idx - 2] *= 2;
                    break;               
                case '#':
                    dart[idx - 1] *= (-1);
                    break; 
                default:
                    // 숫자
                    temp += String.valueOf(dartResult.charAt(i));
                    break;                    
            } 
        }
        answer = dart[0] + dart[1] + dart[2];
        
        return answer;
    }
}
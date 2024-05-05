class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int l = -(board[0] / 2); 
        int r = board[0] / 2;
        int u = board[1] / 2;
        int d = -(board[1] / 2); 
        int x = 0, y =0;
        for(int i = 0; i < keyinput.length; i++) {
            switch(keyinput[i]) {
                case "left":
                    x--;
                    if(x < l) x = l;
                    break;
                case "right":
                    x++;
                    if(x > r) x = r;
                    break;
                case "up":
                    y++;
                    if(y > u) y = u;
                    break;
                case "down":
                    y--;
                    if(y < d) y = d;
                    break;
            }
        }
        int[] answer = {x,y};
        return answer;
        
    }
}
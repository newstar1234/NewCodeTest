class Solution {
    public int solution(int chicken) {
        int answer = 0; // 서비스 수
        int coupon = chicken;
        while(coupon >= 10) {
            // 잔여 쿠폰 수
            int _coupon = coupon % 10;
            // 서비스 수 증가
            answer += coupon / 10;
            // 쿠폰 재 설정
            coupon = coupon / 10 + _coupon;
        }
        
        return answer;
    }
}
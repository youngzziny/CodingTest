class Solution {
    public int solution(int chicken) {
        
        int service = 0;
        int coupon = chicken;
        
        while(true){
        int temp = coupon/10; // 이번 주문에서 받을 수 있는 서비스치킨의 수
        coupon = temp + coupon%10; // 쿠폰수 = 서비스 치킨의 수 + 주문하고 남은 쿠폰의 수
        service += temp;
        if(coupon < 10) break; // 쿠폰을 전부 소진할 때 까지
        }
        
        return service;
    }
}
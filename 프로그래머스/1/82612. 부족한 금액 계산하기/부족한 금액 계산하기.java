class Solution {
    public long solution(int price, int money, int count) {
        
        long pricelong = Long.valueOf(price);
        long moneylong = Long.valueOf(money);
        
        for(int i=1; i<count+1; i++){
            moneylong -= pricelong*i;
        }       

        return moneylong>0?0:Math.abs(moneylong);
    }
}
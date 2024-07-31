class Solution {
    public int solution(int a, int b, int now) {
        int bottle = 0;
        
        while(now >= a){
            bottle += b*(now/a);
            now = now - a*(now/a) + b*(now/a);
        }
        
        return bottle;
    }
}
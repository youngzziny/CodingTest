class Solution {
    public int solution(int n) {
        
        int x;
        
        for(x=1; x<=n; x++){
            if(n%x == 1) break;
        }
        
        return x;
    }
}
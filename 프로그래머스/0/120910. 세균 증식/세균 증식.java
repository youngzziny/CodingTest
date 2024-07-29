class Solution {
    public int solution(int n, int t) {
        int answer = n;
        
        for(int i=t; i>0; i--){
            answer *= 2;
        }
        
        return answer;
    }
}
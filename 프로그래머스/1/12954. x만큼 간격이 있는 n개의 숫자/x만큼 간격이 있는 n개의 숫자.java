class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        Long y = new Long(x);
        
        for(int i=0; i<n; i++){
            answer[i] = y *(i+1);
        }
        
        return answer;
    }
}
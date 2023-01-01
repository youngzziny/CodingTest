class Solution {
    public long solution(int n) {
        long answer = 0;
        
        long[] arr = new long[2000];
        
        arr[0] = 1;
        arr[1] = 2;
        
        for(int i=2; i<2000; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }
        
        return arr[n-1];
    }
}
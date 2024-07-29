class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int[] temp = new int[10];
                
        for(int i=0; i<10; i++){
            temp[i] = i;
        }
        
        for(int i=0; i<numbers.length; i++){
            temp[numbers[i]] = 0;
        }
        
        for(int i=0; i<10; i++){
            answer += temp[i];
        }
        
        return answer;
    }
}
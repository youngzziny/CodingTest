class Solution {
    public String solution(int n) {
        String answer = "수";
        
        for(int i=n-1; i>0; i--){
            if(answer.length()%2 != 0){
                answer += "박";
            }else{
                answer += "수";
            }
        }
        return answer;
    }
}
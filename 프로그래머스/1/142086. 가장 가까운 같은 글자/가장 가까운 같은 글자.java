class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
            if(answer[i] == 0){
                
                answer[i] = -1;
                int num = 1;
                
                for(int j=i+1; j<s.length(); j++){

                    if(s.charAt(i) == s.charAt(j)){
                        answer[j] = num;
                        num = 1;
                    }else{
                        num++;
                    }
                }
            }
        }
        
        return answer;
    }
}
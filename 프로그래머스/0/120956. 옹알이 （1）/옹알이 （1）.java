class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String s:babbling){
            s = s.replace("aya","1");
            s = s.replace("ye","1");
            s = s.replace("woo","1");
            s = s.replace("ma","1");
            s = s.replace("1","");
            
            if(s.equals("")) answer++;
        }
        
        return answer;
    }
}
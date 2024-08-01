class Solution {
    public int solution(String bracket) {
        int answer = 0;        
        String s = bracket;
        
        if(s.length()%2 != 0) return 0;
        
        for(int i=0; i<bracket.length(); i++){
            
            s = bracket;
            
            while(s.contains("()") || s.contains("[]") || s.contains("{}")){
                s = s.replace("()", "").replace("[]", "").replace("{}", "");
            }
            
            if(s.isEmpty()) answer++;
            
            String temp = bracket.charAt(0) + "";
            bracket = bracket.substring(1, bracket.length());
            bracket = bracket + temp;
        }
        
        return answer;
    }
}
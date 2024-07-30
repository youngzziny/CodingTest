class Solution {
    public String[] solution(String[] strArr) {
       
        int arraylength = 0;
        int index = 0;
        
        for(String s:strArr){
            if(!s.contains("ad")) {
                arraylength++;
            }
        }
        
        String[] answer = new String[arraylength];
        
        for(String s:strArr){
            if(!s.contains("ad")) {
                answer[index] = s;
                index++;
            }
        }
        
        return answer;
    }
}
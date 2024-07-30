class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            
            String[] math = quiz[i].split("\\s");
            answer[i] = "X";
            
            if(math[1].equals("+")){
                if(Integer.parseInt(math[0]) + Integer.parseInt(math[2]) == Integer.parseInt(math[4])){
                    answer[i] = "O";
                }
            }else{
                if(Integer.parseInt(math[0]) - Integer.parseInt(math[2]) == Integer.parseInt(math[4])){
                    answer[i] = "O";
                }
            }
        }
        
        return answer;
    }
}
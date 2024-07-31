class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i=1; i<food.length; i++){
            
            int num = food[i];            
            if(food[i]%2 == 1) num -= 1;
            num /= 2;
            
            answer += Integer.toString(i).repeat(num);
        }
        
        answer += "0";
        
        for(int i=food.length-1; i>0; i--){
            
            int num = food[i];            
            if(food[i]%2 == 1) num -= 1;
            num /= 2;
            
            answer += Integer.toString(i).repeat(num);
        }
        
        return answer;
    }
}
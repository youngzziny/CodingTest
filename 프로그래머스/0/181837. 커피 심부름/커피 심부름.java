class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(int i=0; i<order.length; i++){
            if(order[i].charAt(3) == 'a'){ // ~ 아메리카노
                answer += 4500;
            }else if(order[i].charAt(3) == 'r'){ // 아메리카노 ~
                answer += 4500;
            }else if(order[i].charAt(3) == 'c'){ // ~ 카페라떼
                answer += 5000;
            }else if(order[i].charAt(3) == 'e'){ // 카페라떼 ~
                answer += 5000;
            }else if(order[i].charAt(3) == 't'){ // 아무거나
                answer += 4500;
            }
        }
        
        return answer;
    }
}
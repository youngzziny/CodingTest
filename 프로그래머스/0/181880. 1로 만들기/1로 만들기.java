class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i:num_list){          
            while(i != 1){
                if(i%2 == 0){
                    i = i/2;
                    answer++;
                }else{
                    i = (i-1)/2;
                    answer++;
                }
            }           
        }
        
        return answer;
    }
}
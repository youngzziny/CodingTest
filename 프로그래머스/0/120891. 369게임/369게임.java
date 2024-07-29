class Solution {
    public int solution(int order) {
        int clap = 0;
        
        while(order != 0){
            
            int temp = order%10;
            
            if(temp == 3 || temp == 6 || temp == 9){
                clap++;
            }
            
            order = order/10;
        }
        
        return clap;
    }
}
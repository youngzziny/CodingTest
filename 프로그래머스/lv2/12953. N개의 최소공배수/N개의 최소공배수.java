class Solution {
    public int solution(int[] arr) {
        int lcm = 1;
        
        while(true){           
           for(int i=0; i<arr.length; i++){
                if(lcm % arr[i] != 0){
                    lcm++;
                    i=-1;
                }
            }
            break;
        }
            
        return lcm;
    }
}
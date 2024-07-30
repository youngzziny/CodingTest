class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        if(direction.equals("right")){
            
            int firstnum = numbers[0];
            numbers[0] = numbers[numbers.length-1];
            
            for(int i=numbers.length-1; i>0; i--){
                
                if(i == 1){
                    numbers[i] = firstnum;
                    continue;
                }
                
                numbers[i] = numbers[i-1];                
            }
            
            
        }else{
            
            int lastnum = numbers[numbers.length-1];
            numbers[numbers.length-1] = numbers[0];
            
            for(int i=0; i<numbers.length-1; i++){
                
                if(i == numbers.length-2){
                    numbers[numbers.length-2] = lastnum;
                    continue;
                }                
                numbers[i] = numbers[i+1];                
            }            
        }
        return numbers;
    }
}
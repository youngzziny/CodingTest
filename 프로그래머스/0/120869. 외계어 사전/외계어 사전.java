class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for(String s:dic){
            for(int i=0; i<spell.length; i++){
                s = s.replaceFirst(spell[i], "1");
            }
            if(s.equals("1".repeat(spell.length))) return 1;
        }
        
        return 2;
    }
}
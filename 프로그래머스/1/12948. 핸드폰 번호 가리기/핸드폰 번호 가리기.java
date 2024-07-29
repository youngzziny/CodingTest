class Solution {
    public String solution(String phone_number) {
        
        String star = "*";
        String number = phone_number.substring(phone_number.length()-4,phone_number.length());

        return star.repeat(phone_number.length()-4) + number;
    }
}
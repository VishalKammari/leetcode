class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        String sol="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                count--;
            }
            if(count!=0){
                sol+=s.charAt(i);
            }
            if(s.charAt(i)=='('){
                count++;
            }
        }
        return sol;
    }
}
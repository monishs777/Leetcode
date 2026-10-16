import java.util.ArrayDeque;
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str= new StringBuilder();
        ArrayDeque<Character> para=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(!para.isEmpty()){
                    str.append(ch);
                }
                para.push(ch);
            }
            else{
                para.pop();
                if(!para.isEmpty()){
                    str.append(ch);
                }
            }
        }
        return str.toString();
    }
}
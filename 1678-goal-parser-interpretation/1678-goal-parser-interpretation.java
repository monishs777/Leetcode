class Solution {
    public String interpret(String command) {
        StringBuilder a=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                a.append("G");
            }
            if(command.charAt(i)=='('&&command.charAt(i+1)==')'){
                a.append("o");
            }
            if(command.charAt(i)=='('&&command.charAt(i+1)=='a'&&command.charAt(i+2)=='l'){
                a.append("al");
            }
        }
        return a.toString();
    }
}
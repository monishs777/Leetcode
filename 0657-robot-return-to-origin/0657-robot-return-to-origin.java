class Solution {
    public boolean judgeCircle(String moves) {
        int a=0;
        int b=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                a+=1;
            }
            if(moves.charAt(i)=='D'){
                a-=1;
            }
            if(moves.charAt(i)=='R'){
                b+=1;
            }
            if(moves.charAt(i)=='L'){
                b-=1;
            }
        }
        if(a==0 && b==0){
            return true;
        }
        return false;
    }
}
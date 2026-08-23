class Solution {
    public int romanToInt(String s) {
        int I=1;
        int V=5;
        int X=10;
        int L=50;
        int C=100;
        int D=500;
        int M=1000;
        int a=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='I'){
                if(i+1<s.length()&&(s.charAt(i+1)=='V'||s.charAt(i+1)=='X')){
                    a-=1;
                }
                else{
                    a+=1;
                }
            }
            else if(s.charAt(i)=='V'){
                a+=5;
            }
            else if(s.charAt(i)=='X'){
                if(i+1<s.length()&&(s.charAt(i+1)=='L'||s.charAt(i+1)=='C')){
                    a-=10;
                }
                else{
                    a+=10;
                }
            }
            else if(s.charAt(i)=='L'){
                a+=50;
            }
            else if(s.charAt(i)=='C'){
                if(i+1<s.length()&&(s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
                    a-=100;
                }
                else{
                    a+=100;
                }
            }
            else if(s.charAt(i)=='D'){
                a+=500;
            }
            else{
                a+=1000;
            }
            System.out.println(a);
        }
        return a;
    }
}
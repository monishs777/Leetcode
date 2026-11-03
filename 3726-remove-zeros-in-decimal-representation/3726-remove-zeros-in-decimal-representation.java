class Solution {
    public long removeZeros(long n) {
        long a=0,c=1;
        while(n>0){
            long b=n%10;
            if(b!=0){
                a+=b*c;
                c=c*10;
            }
            n=n/10;
        }
        return a;
    }
}
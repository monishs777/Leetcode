class Solution {
    public boolean checkGoodInteger(int n) {
        int a=0,b=0;
        while(n!=0){
            a+=(n%10);
            b+=(n%10)*(n%10);
            n=n/10;
        }
        if((b-a)>=50){
            return true;
        }
        return false;
    }
}
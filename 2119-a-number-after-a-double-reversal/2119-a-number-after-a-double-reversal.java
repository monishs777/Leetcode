class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev=0;
        int Rev=0;
        int a=num;
        while(num!=0){
            int b=num%10;
            rev=rev*10 +b;
            num=num/10;
        }
        while(rev!=0){
            int c=rev%10;
            Rev=Rev*10+c;
            rev=rev/10;
        }
        if(Rev==a){
            return true;
        }
        return false;
    }
}
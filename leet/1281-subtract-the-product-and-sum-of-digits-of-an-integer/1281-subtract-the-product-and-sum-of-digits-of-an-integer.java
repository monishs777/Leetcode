class Solution {
    public int subtractProductAndSum(int n) {
        int a=1,b=0;
        while(n!=0){
            a=a*(n%10);
            b+=n%10;
            n=n/10;
        }
        return a-b;
    }
}
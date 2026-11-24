class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int val=0;
        for(int i=0;i<4;i++){
            int a=num1%10;
            int b=num2%10;
            int c=num3%10;
            val+=Math.min(a,Math.min(b,c))*Math.pow(10,i);
            num1=num1/10;
            num2=num2/10;
            num3=num3/10;
        }
        return val;
    }
}
class Solution {
    public int addDigits(int num) {
        int a=0;
        if(num<10){
            return num;
        }
        while(num>=10){
            a=0;
            while(num>0){
                a =a +(num%10);
                num=num/10;
            }
            num=a;
            
        }
        return a;
    }
}
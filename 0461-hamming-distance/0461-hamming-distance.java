class Solution {
    public int hammingDistance(int x, int y) {
        int temp =(x^y);
        int dis=0;
        while(temp>0){
            if((temp&1)==1){
                dis=dis+1;
            }
            temp=temp>>1;
        }
        return dis;
    }
}
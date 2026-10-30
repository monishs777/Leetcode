class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int sum=0;
        for(int i=low;i<=high;i++){
            int value=i;
            String st=String.valueOf(i);
            if(st.length()%2!=0){
                continue;
            }
            int a=0,b=0;
            for(int j=0;j<st.length()/2;j++){
                a+=value%10;
                value=value/10;
            }
            for(int j=st.length()/2;j<st.length();j++){
                b+=value%10;
                value=value/10;
            }
            if(a==b){
                sum++;
            }
        }
        return sum;
    }
}
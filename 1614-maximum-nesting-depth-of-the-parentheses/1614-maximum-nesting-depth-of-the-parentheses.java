class Solution {
    public int maxDepth(String s) {
        int max=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                sum++;
            }
            if(sum>max){
                max=sum;
            }
            if(ch==')'){
                sum--;
            }
        }
        return max;
    }
}
class Solution {
    public int smallestEvenMultiple(int n) {
        int a=1;
        while(true){
            if(a%2==0 && a%n==0){
                return a;
            }
            a++;
        }
        
    }
}
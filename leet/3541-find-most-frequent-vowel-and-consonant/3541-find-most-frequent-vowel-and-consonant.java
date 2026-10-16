class Solution {
    public int maxFreqSum(String s) {
        int vow=0,con=0;
        int a[]=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            char ch=(char)(i+'a');
            if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'){
                if(a[i]>vow){
                    vow =a[i];
                }
            }
            else{
                if(a[i]>con){
                    con=a[i];
                }
            }
        }
        
        return con+vow;
    }
}
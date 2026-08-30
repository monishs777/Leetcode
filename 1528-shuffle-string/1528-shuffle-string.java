class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder st=new StringBuilder();
        int a=0;
        for(int j=0;j<indices.length;j++){
            for(int i=0;i<indices.length;i++){
                if(a==indices[i]){
                    st.append(s.charAt(i));
                    a++;
                }
            }   
        }
        
        return st.toString();
    }
}
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char a=letters[0];
        for(int i=0;i<letters.length;i++){
            if(((int)letters[i])>target) {
                a= letters[i];
                break;
            }
        }
        return a;
    }
}
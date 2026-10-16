class Solution {
    public String convertDateToBinary(String date) {
        String [] arr= date.split("-");
        String a=Integer.toBinaryString(Integer.parseInt(arr[0]));
        String b=Integer.toBinaryString(Integer.parseInt(arr[1]));
        String c=Integer.toBinaryString(Integer.parseInt(arr[2]));
        return a+"-"+b+"-"+c;
    }
}
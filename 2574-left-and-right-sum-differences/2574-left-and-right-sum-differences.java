class Solution {
    public int[] leftRightDifference(int[] nums) {
        int []num1=new int[nums.length];
        int []num2=new int[nums.length];
        int []num=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            num1[i]=nums[i-1]+num1[i-1];
        }
       
        for(int i=nums.length-2;i>=0;i--){
            num2[i]=nums[i+1]+num2[i+1];
        }
        for(int i=0;i<nums.length;i++){
            num[i]=Math.abs(num1[i]-num2[i]);
        }
        return num;
    }
}
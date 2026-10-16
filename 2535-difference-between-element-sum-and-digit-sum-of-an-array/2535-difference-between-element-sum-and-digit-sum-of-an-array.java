class Solution {
    public int differenceOfSum(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            a+=nums[i];
            while(nums[i]!=0){
                b+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
        }
        return a-b;
    }
}
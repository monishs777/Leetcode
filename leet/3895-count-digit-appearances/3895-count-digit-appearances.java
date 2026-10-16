class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                if(nums[i]%10==digit){
                    a++;
                }
                nums[i]=nums[i]/10;
            }
        }
        return a;
    }
}